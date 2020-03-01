package com.microservicetphl.users.web.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microservicetphl.users.dao.UserDao;
import com.microservicetphl.users.web.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    public Users userr;

    @Autowired
    private UserDao userDao;

    @PostMapping(value = "/register")
    public ResponseEntity<Void> registration(@RequestBody Users user) {
        // parse des infos client et creation d'un nouvel objet users avec ses infos.
        // push de l'user dans la bdd
        Users users1 = userDao.save(user);

        if (user == null) {
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(users1.getId())
                .toUri();

        // return la reponse 201 created avec l'uri vers le nouveau produit.
        return ResponseEntity.created(location).build();
    }

    //faire une route pour modifier un account grace a son id

    @PutMapping(value = "/account")
    @JsonIgnore
    @JsonProperty(value = "currentPointOfFidelity")
    public ResponseEntity<String> modifyAccount(@RequestBody Users user) {

        if (user == null) {
            return ResponseEntity.noContent().build();
        }
        userr = userDao.findById(user.id);
        if (userr == null) {
            return ResponseEntity.badRequest().body("L'utilisateur n'existe pas");
        }
        userDao.modifyAccount(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand()
                .toUri();

        return ResponseEntity.ok().body("Your account has been modified");
        //return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/users/{id}")
    public Users getUsersById(@PathVariable int id) {
        return userDao.findById(id);
    }

    @GetMapping(value = "/users")
    public List<Users> getAllClients() {
        return userDao.findAll();
    }
}
