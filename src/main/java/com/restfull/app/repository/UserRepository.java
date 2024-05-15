package com.restfull.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfull.app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {}
