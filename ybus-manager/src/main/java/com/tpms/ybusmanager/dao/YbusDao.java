package com.tpms.ybusmanager.dao;

import com.tpms.ybusmanager.web.model.Ybus;
import java.util.List;

public interface YbusDao {
    public Ybus save(Ybus ybus);
    public List<Ybus> findAll();
    public Ybus findById(int id);
}
