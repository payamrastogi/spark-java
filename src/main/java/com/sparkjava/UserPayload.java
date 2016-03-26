package com.sparkjava;

import lombok.Data;

public @Data class UserPayload implements Validable
{
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private Company company;
	private String profilePic;
	
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	@Override
	public boolean isValid() 
	{
		return firstName != null && !firstName.isEmpty() 
			&& lastName != null && !lastName.isEmpty()
			&& address.isValid()
			&& company.isValid();
	}
}
