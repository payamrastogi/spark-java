package com.sparkjava;

import static spark.Spark.get;
import static spark.Spark.post;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import spark.Request;
import spark.Response;
import spark.Route;

public class UserManagementService 
{   
	private static final int HTTP_BAD_REQUEST = 400;
	public static void main(String args[])
	{
		Model model = new Model();
	    // insert a post (using HTTP post method)
	    post("/createuser", (request, response) -> 
	    {
	        try 
	        {
	            ObjectMapper mapper = new ObjectMapper();
	            UserPayload creation = mapper.readValue(request.body(), UserPayload.class);
	            if (!creation.isValid()) 
	            {
	                response.status(HTTP_BAD_REQUEST);
	                return "";
	            }
	            String id = model.createUser(creation);
	            response.status(200);
	            response.type("application/json");
	            return id;
	        } 
	        catch (JsonParseException jpe) 
	        {
	            response.status(HTTP_BAD_REQUEST);
	            return "";
	        }
	    });
	    
	    // get all post (using HTTP get method)
	    get("/getallusers", (request, response) -> 
	    {
	        response.status(200);
	        response.type("application/json");
	        return dataToJson(model.getAllUsers());
	    });
	}
	
	public static String dataToJson(Object data) 
	{
        try 
        {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            mapper.writeValue(sw, data);
            return sw.toString();
        } 
        catch (IOException e)
        {
            throw new RuntimeException("IOException from a StringWriter?");
        }
    }
}
