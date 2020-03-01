package com.microservicetphl.users.dao;

import com.microservicetphl.users.web.model.Users;

import java.util.List;

public interface UserDao {
    public Users save(Users user);
    public List<Users> findAll();
    public Users findById(int id);
    public Users modifyAccount(Users user);
}
