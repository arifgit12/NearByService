package com.nearby.app.services;

import java.util.List;

import com.nearby.app.models.User;

public interface UserService {
	User save(User user);
	User findByUsername(String username);
	List<User> findAllUser();
}
