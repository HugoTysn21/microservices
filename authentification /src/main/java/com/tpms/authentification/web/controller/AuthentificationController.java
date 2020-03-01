package com.tpms.authentification.web.controller;

import com.tpms.authentification.dao.UserDao;
import com.tpms.authentification.web.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class AuthentificationController {

    // il faut d'abord analyser la requete POST /login, setter dans une variable les
    // identifiants du client (son id).
    // ensuite il faut executé une requete get avec l'id recupéré auparavant (du client)
    // cette requete va recupéré les champs "email" et "password" du client
    // une fois récupérer faire un if qui compare les deux champs
    // si c'est valide -> creation du token pour le client.

    private final String message = "Invalid credentials : The login or password is incorrect please check your credentials";
    public Boolean check;

    @Autowired
    private UserDao userDao;

    @PostMapping(value = "/login")
    public ResponseEntity<String> registration(@RequestBody Users user) {
        // parse des infos client et creation d'un nouvel objet users avec ses infos.
        // push de l'user dans la bdd

        check = userDao.checkLogin(user.email, user.password);
        if (!check){
            return ResponseEntity.badRequest().body(message);
        }


        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        // return la reponse 201 created avec l'uri vers le nouveau produit.
        return ResponseEntity.created(location).build();
    }

}
