package com.example3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	
}
