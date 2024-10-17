package com.resst.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resst.restaurant.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {

}
