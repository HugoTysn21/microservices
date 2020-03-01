package com.tpms.reservation.dao;

import com.tpms.reservation.web.model.Reservation;
import com.tpms.reservation.web.model.Train;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReservationDaoImpl implements ReservationDao {

    public static List<Reservation> reservationList = new ArrayList<>();

    static {
        reservationList.add(new Reservation(0, 0, "stringer", "Bell", "stringerbell@gmail.com", "12/12/1999", "+1 33 44 32 11 89", "bus", 1987652, "15$", "20%", "Paris", "7H", "Lyon", "9h", 16));
        reservationList.add(new Reservation(1, 1, "Avon", "Barksdale", "avonbarksdale@gmail.com", "12/12/1997", "+1 33 44 32 11 89", "train", 2251617, "25$", "20%", "Paris", "10H", "Lille", "11h30", 33));
    }

    @Override
    public Reservation save(Reservation user) {
        reservationList.add(user);
        return user;
    }

    @Override
    public List<Reservation> findAll() {
        return reservationList;
    }

    @Override
    public Reservation findById(int id) {
        for (Reservation reservation : reservationList) {
            if (reservation.getId() == id) {
                return reservation;
            }
        }
        return null;
    }
}
