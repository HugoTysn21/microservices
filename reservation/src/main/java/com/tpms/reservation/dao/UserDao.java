package com.tpms.reservation.dao;

import com.tpms.reservation.web.model.Users;

import java.util.List;

public interface UserDao {
    public Users save(Users user);
    public List<Users> findAll();
    public Users findById(int id);
    public Boolean addPointFidelity(int number, String email, String type);
}