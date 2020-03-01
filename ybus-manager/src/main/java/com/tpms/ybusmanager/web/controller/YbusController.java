package com.tpms.ybusmanager.web.controller;

import com.tpms.ybusmanager.dao.YbusDao;
import com.tpms.ybusmanager.web.model.Ybus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class YbusController {

    @Autowired
    private YbusDao ybusDao;

    @PostMapping(value = "/add")
    public ResponseEntity<Void> registration(@RequestBody Ybus ybus) {
        // parse des infos client et creation d'un nouvel objet users avec ses infos.
        // push de l'user dans la bdd
        Ybus ybus1 = ybusDao.save(ybus);
        System.out.println(getAllYbusYtrain());

        if (ybus == null){
            return ResponseEntity.noContent().build();
        }

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(ybus1.getId())
                .toUri();

        // return la reponse 201 created avec l'uri vers le nouveau produit.
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "bustrain/{id}")
    public Ybus findBusById(@PathVariable int id){
        return ybusDao.findById(id);
    }

    @GetMapping(value = "/all")
    public List<Ybus> getAllYbusYtrain(){
        return ybusDao.findAll();
    }

    public void isFull(){

    }
}
