package com.tpms.reservation.web.controller;

import com.tpms.reservation.dao.ReservationDao;
import com.tpms.reservation.dao.TrainDao;
import com.tpms.reservation.dao.UserDao;
import com.tpms.reservation.web.model.Reservation;
import com.tpms.reservation.web.model.Train;
import com.tpms.reservation.web.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static com.tpms.reservation.dao.ReservationDaoImpl.reservationList;

@RestController
public class ReservationController {

    public Train findTrainId;
    public Boolean trainCapacity;
    public String errorMessage = "Le train ou bus que vous souhaitez réserver n'éxiste pas dans notre base de données.";
    public String paymentSuccess = "Felicitations votre train est reservé, vous pouvez retrouvé votre reservation sur le lien /reservation/";

    @Autowired
    private ReservationDao reservationDao;

    @Autowired
    private TrainDao trainDao;

    @Autowired
    private UserDao userDao;

    @PostMapping(value = "/reservation")
    public ResponseEntity<String> registration(@RequestBody Reservation reservation) {
        if (reservation == null) {
            return ResponseEntity.noContent().build();
        }
        findTrainId = trainDao.findById(reservation.id_train);
        if (findTrainId == null) {
            return ResponseEntity.badRequest().body(errorMessage);
        }
        // MAJ capacity du train ou bus
        trainCapacity = trainDao.addCapacity(1, reservation.id_train, reservation.type);
        if (!trainCapacity) {
            return ResponseEntity.badRequest().body("Le train est plein");
        }
        // add le point de reservation si il est dans le file client.
        userDao.addPointFidelity(1,reservation.email, reservation.type);
        // Make the reservation
        Reservation reservation1 = reservationDao.save(reservation);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(reservation1.getId())
                .toUri();

        // return la reponse 201 created avec l'uri vers la nouvel reservation.
        return ResponseEntity.created(location).build();
    }

    @GetMapping(value = "/users")
    public List<Users> getAllUsers() {
        return userDao.findAll();
    }

    @GetMapping(value = "/reservation/{id}/payment")
    public ResponseEntity<String> getReservationPayment(@PathVariable int id) {
        return ResponseEntity.accepted().body(paymentSuccess + id);
    }
    @GetMapping(value = "/all")
    public List<Train> getAllYbusYtrain(){
        return trainDao.findAll();
    }
    @GetMapping(value = "/reservations/all")
    public List<Reservation> getAllReservations() {
        return reservationDao.findAll();
    }

    @GetMapping(value = "/reservation/{id}")
    public Reservation getReservationById(@PathVariable int id) {
        // faire une reponse http si le train existe pas
        return reservationDao.findById(id);
    }
}
