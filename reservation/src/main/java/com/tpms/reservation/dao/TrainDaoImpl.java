package com.tpms.reservation.dao;

import com.tpms.reservation.web.model.Train;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TrainDaoImpl implements TrainDao {

    public Train allCapacity;
    public static List<Train> trainList = new ArrayList<>();

    static {
        trainList.add(new Train(0, "bus", "Paris-Lille", "7h", "15$", 34));
        trainList.add(new Train(1, "bus", "Paris-Lyon", "8h", "25$", 29));
        trainList.add(new Train(2, "train", "Paris-Strasbourg", "10h", "25$", 140));
        trainList.add(new Train(3, "train", "Lyon-Marseille", "14h", "25$", 176));
        trainList.add(new Train(4, "train", "Paris-Bordeaux", "11h", "25$", 179));
    }

    @Override
    public Train save(Train train) {
        trainList.add(train);
        return train;
    }

    @Override
    public List<Train> findAll() {
        return trainList;
    }

    @Override
    public Train findById(int id) {
        for (Train ybus : trainList) {
            if (ybus.getId() == id) {
                return ybus;
            }
        }
        return null;
    }

    @Override
    public Boolean addCapacity(int number, int id, String type) {
        for (Train ybus : trainList) {
            if (ybus.getId() == id) {
                if (ybus.getType().equals("train")){
                    if (ybus.getCapacity() >= 180){
                        return false;
                    } else {
                        ybus.setCapacity(ybus.getCapacity() + 1);
                        return true;
                    }
                }
                else if(ybus.getType().equals("bus")){
                    if (ybus.getCapacity() >= 36) {
                        return false;
                    } else {
                        ybus.setCapacity(ybus.getCapacity() + 1);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


