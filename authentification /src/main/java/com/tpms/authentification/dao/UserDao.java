package com.tpms.authentification.dao;

import com.tpms.authentification.web.model.Users;

import java.util.List;

public interface UserDao {
    public Users save(Users user);
    public List<Users> findAll();
    public Users findById(int id);
    public Boolean addPointFidelity(int number, String email, String type);
    public Boolean checkLogin(String email, String password);
}
