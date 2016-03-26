package com.sparkjava;

import lombok.Data;

public class Company implements Validable
{
	private String name;
	private String website;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public boolean isValid() 
	{
		return true;
	}
}
