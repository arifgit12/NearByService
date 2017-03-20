package com.nearby.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

@Entity
public class User {
 	@Id
    @GeneratedValue
    private int usersId;
    private String username;
    private String password;
    private boolean enabled;
    
}
