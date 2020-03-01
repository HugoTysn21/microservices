package com.tpms.reservation.web.model;

public class Reservation
{
    public int id;
    public int id_train;
    public String name;
    public String surname;
    public String email;
    public String birth_date;
    public String tel_number;
    public String type;
    public int reservation_number;
    public String prix_HT;
    public String tva;
    public String gare_depart;
    public String heure_depart_prevue;
    public String gare_arrivee_prevue;
    public String heure_arrivee_prevue;
    public int seat_number;

    public Reservation(int id, int id_train, String name, String surname, String email, String birth_date, String tel_number, String type, int reservation_number, String prix_HT, String tva, String gare_depart, String heure_depart_prevue, String gare_arrivee_prevue, String heure_arrivee_prevue, int seat_number) {
        this.id = id;
        this.id_train = id_train;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth_date = birth_date;
        this.tel_number = tel_number;
        this.type = type;
        this.reservation_number = reservation_number;
        this.prix_HT = prix_HT;
        this.tva = tva;
        this.gare_depart = gare_depart;
        this.heure_depart_prevue = heure_depart_prevue;
        this.gare_arrivee_prevue = gare_arrivee_prevue;
        this.heure_arrivee_prevue = heure_arrivee_prevue;
        this.seat_number = seat_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_train() {
        return id_train;
    }

    public void setId_train(int idTrain){
        this.id_train = idTrain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReservation_number() {
        return reservation_number;
    }

    public void setReservation_number(int reservation_number) {
        this.reservation_number = reservation_number;
    }

    public String getPrix_HT() {
        return prix_HT;
    }

    public void setPrix_HT(String prix_HT) {
        this.prix_HT = prix_HT;
    }

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }

    public String getGare_depart() {
        return gare_depart;
    }

    public void setGare_depart(String gare_depart) {
        this.gare_depart = gare_depart;
    }

    public String getHeure_depart_prevue() {
        return heure_depart_prevue;
    }

    public void setHeure_depart_prevue(String heure_depart_prevue) {
        this.heure_depart_prevue = heure_depart_prevue;
    }

    public String getGare_arrivee_prevue() {
        return gare_arrivee_prevue;
    }

    public void setGare_arrivee_prevue(String gare_arrivee_prevue) {
        this.gare_arrivee_prevue = gare_arrivee_prevue;
    }

    public String getHeure_arrivee_prevue() {
        return heure_arrivee_prevue;
    }

    public void setHeure_arrivee_prevue(String heure_arrivee_prevue) {
        this.heure_arrivee_prevue = heure_arrivee_prevue;
    }

    public int getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(int seat_number) {
        this.seat_number = seat_number;
    }
}
