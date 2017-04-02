package com.nearby.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
 	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String username;
    private String password;
    private boolean enabled;
    private String role;

    public User(){

    }

    public User(String username, String password){
    	this.username = username;
    	this.password = password;
    	this.enabled = true;
    	this.role = "Admin";
    }
    
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
    
}
