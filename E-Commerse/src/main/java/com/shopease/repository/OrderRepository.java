package com.shopease.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopease.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
