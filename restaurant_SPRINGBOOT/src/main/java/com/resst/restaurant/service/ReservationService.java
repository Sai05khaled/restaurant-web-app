package com.resst.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resst.restaurant.model.Reservation;
import com.resst.restaurant.repository.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);

    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

}
