package com.resst.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resst.restaurant.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
