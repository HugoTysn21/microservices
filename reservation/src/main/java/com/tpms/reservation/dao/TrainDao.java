package com.tpms.reservation.dao;

import com.tpms.reservation.web.model.Reservation;
import com.tpms.reservation.web.model.Train;

import java.util.List;

public interface TrainDao {

    public Train save(Train train);
    public List<Train> findAll();
    public Train findById(int id);
    public Boolean addCapacity(int number, int id, String type);

}
