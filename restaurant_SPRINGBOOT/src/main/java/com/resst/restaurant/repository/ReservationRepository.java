package com.resst.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resst.restaurant.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
