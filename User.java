package com.model;
//  , tablename =>user
public class User {
	private String username;
	private String password;
	// primary key
	private String email;
	private String city;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String email, String city, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.city = city;
		this.phone = phone;
	}
	public String getUsername() {
		
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", city=" + city
				+ ", phone=" + phone + "]";
	}
	
}
