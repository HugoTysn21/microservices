package com.microservicetphl.users.dao;

import com.microservicetphl.users.web.model.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDaoImpl implements UserDao {

    public static List<Users> usersList = new ArrayList<>();
    static {
        usersList.add(new Users(0,"stringer","Bell","stringerbell@gmail.com","12/12/1999","+1 33 44 32 11 89", 11 ));
        usersList.add(new Users(1,"Avon","Barksdale","avonbarksdale@gmail.com","12/12/1997","+1 33 44 32 11 89", 19 ));
    }

    @Override
    public Users save(Users user) {
        usersList.add(user);
        return user;
    }

    @Override
    public List<Users> findAll() {
        return usersList;
    }

    @Override
    public Users findById(int id) {
        for (Users users : usersList) {
            if(users.getId() ==id){
                return users;
            }
        }
        return null;
    }

    @Override
    public Users modifyAccount(Users user) {
        for (Users users : usersList) {
            if(users.getId() == user.id){
                user.setCurrentPointOfFidelity(users.getCurrentPointOfFidelity());
            }
        }
        usersList.set(user.id,user);
        return user;
    }
}
