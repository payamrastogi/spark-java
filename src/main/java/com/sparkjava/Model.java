package com.sparkjava;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Data;

public class Model 
{
	private int nextId = 1;
    private Map<String, UserVO> users = new HashMap<>();
    
    public String createUser(UserPayload userPayload)
    {
        String id = (nextId++)+"";
        UserVO userDAO = new UserVO();
        userDAO.setId(id);
        userDAO.setFirstName(userPayload.getFirstName());
        userDAO.setLastName(userPayload.getLastName());
        userDAO.setEmail(userPayload.getEmail());
        //userDAO.setAddressDAO(userPayload.getAddress());
        //userDAO.setCompanyDAO(userPayload.getCompany());
        userDAO.setDateCreated(new Date());
        userDAO.setProfilePic(userPayload.getProfilePic());
        users.put(id, userDAO);
        return id;
    }
    
    public List getAllUsers()
    {
        return users.keySet().stream().sorted().map((id) -> users.get(id)).collect(Collectors.toList());
    }
    
    
}
