package com.resst.restaurant.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.resst.restaurant.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
