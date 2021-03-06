package com.nearby.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nearby.app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);
}
