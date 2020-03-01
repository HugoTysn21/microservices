package com.tpms.reservation.dao;

import com.tpms.reservation.web.model.Reservation;

import java.util.List;

public interface ReservationDao {
    public Reservation save(Reservation reservation);
    public List<Reservation> findAll();
    public Reservation findById(int id);
}
