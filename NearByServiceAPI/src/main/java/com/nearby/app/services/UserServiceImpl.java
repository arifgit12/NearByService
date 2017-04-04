package com.nearby.app.services;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nearby.app.models.User;
import com.nearby.app.repository.RoleRepository;
import com.nearby.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository userRepository;

	@Autowired
    private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    user.setRoles(new HashSet<>(roleRepository.findAll()));
		return userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}
}
