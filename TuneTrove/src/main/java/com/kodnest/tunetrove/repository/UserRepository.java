package com.kodnest.tunetrove.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodnest.tunetrove.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	public User findByEmail(String email);

}
