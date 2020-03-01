package com.microservicetphl.users.web.model;

public class Users {

    public int id;
    public String name;
    public String surname;
    public String email;
    public String birth_date;
    public String number;
    public int currentPointOfFidelity;

    public Users(int id, String name, String surname, String email, String birth_date, String number, int currentPointOfFidelity) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth_date = birth_date;
        this.number = number;
        this.currentPointOfFidelity = currentPointOfFidelity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCurrentPointOfFidelity() {
        return currentPointOfFidelity;
    }

    public void setCurrentPointOfFidelity(int currentPointOfFidelity) {
        this.currentPointOfFidelity = currentPointOfFidelity;
    }
}
