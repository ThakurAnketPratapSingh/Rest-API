package com.anket.webservices.restfullwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anket.webservices.restfullwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
