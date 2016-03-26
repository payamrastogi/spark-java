package com.sparkjava;

import java.util.Date;

public class UserDAO 
{
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private AddressDAO address;
	private CompanyDAO company;
	private Date dateCreated;
	private String profilePic;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressDAO getAddress() {
		return address;
	}
	public void setAddress(AddressDAO address) {
		this.address = address;
	}
	public CompanyDAO getCompany() {
		return company;
	}
	public void setCompany(CompanyDAO company) {
		this.company = company;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
}
