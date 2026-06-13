package com.example4.dto;

import java.util.Objects;

public class AuthRequest {
	private String username;
	private String password;
	public AuthRequest() {
		super();
	}
	public AuthRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsrname() {
		return username;
	}
	public void setUsrname(String usrname) {
		this.username = usrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AuthRequest [username=" + username + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthRequest other = (AuthRequest) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}
	
}
