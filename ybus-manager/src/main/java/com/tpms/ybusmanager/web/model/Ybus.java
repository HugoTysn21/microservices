package com.tpms.ybusmanager.web.model;

public class Ybus
{
    public int id;
    public String type;
    public String ligne_destination;
    public String horaire;
    public String prix;
    public String capacity;

    public Ybus(int id, String type, String ligne_destination, String horaire, String prix, String capacity) {
        this.id = id;
        this.type = type;
        this.ligne_destination = ligne_destination;
        this.horaire = horaire;
        this.prix = prix;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLigne_destination() {
        return ligne_destination;
    }

    public void setLigne_destination(String ligne_destination) {
        this.ligne_destination = ligne_destination;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
