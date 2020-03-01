package com.tpms.ybusmanager.dao;

import com.tpms.ybusmanager.web.model.Ybus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class YbusDaoImpl implements YbusDao {

    public static List<Ybus> ybusList = new ArrayList<>();
    static {
        ybusList.add(new Ybus(0,"bus","Paris-Lille","7h","15$","0/40"));
        ybusList.add(new Ybus(1,"train","Paris-Lyon","7h","25$","0/40"));
    }

    @Override
    public Ybus save(Ybus ybus) {
        ybusList.add(ybus);
        return ybus;
    }

    @Override
    public List<Ybus> findAll() {
        return ybusList;
    }

    @Override
    public Ybus findById(int id) {
        for (Ybus ybus : ybusList) {
            if(ybus.getId() ==id){
                return ybus;
            }
        }
        return null;
    }
}