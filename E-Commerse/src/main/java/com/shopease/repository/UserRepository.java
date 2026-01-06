package com.shopease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
