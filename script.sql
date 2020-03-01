DROP DATABASE IF EXISTS tpms;
CREATE DATABASE IF NOT EXISTS tpms;
USE tpms;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS reservation;
DROP TABLE IF EXISTS train_bus;

CREATE TABLE users
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    email VARCHAR(255),
    birth_date VARCHAR(100),
    password VARCHAR(100),
    telephone_number VARCHAR(100),
    point_fidelity INT
);

CREATE TABLE reservation
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    birth_date DATE,
    email VARCHAR(100),
    telephone_number VARCHAR(100),
    reservation_number VARCHAR(100),
    prix_ht INT,
    tva VARCHAR(100),
    gare_depart VARCHAR(100),
    heure_depart_prevu VARCHAR(100),
    gare_arrivee VARCHAR(100),
    heure_arrivee_prevu VARCHAR(100),
    seat_number VARCHAR(100),
    train_bus_id INT REFERENCES train_bus(id),
    users_id INT REFERENCES users(id)
);

CREATE TABLE train_bus
(
    id INT PRIMARY KEY NOT NULL,
    type VARCHAR(100),
    ligne_destination VARCHAR(100),
    horaire VARCHAR(100),
    prix VARCHAR(100),
    capacity VARCHAR(100)
);

INSERT INTO train_bus VALUES(0,'bus','Paris-Lille','7h00','15$','0/40');
INSERT INTO train_bus VALUES(1,'train','Paris-Lille','8h00','25$','0/40');
INSERT INTO train_bus VALUES(2,'bus','Paris-Lille','9h00','15$','0/40');
INSERT INTO train_bus VALUES(3,'train','Paris-Lille','10h00','25$','0/40');
INSERT INTO train_bus VALUES(4,'bus','Paris-Lille','11h00','15$','0/40');
INSERT INTO train_bus VALUES(5,'train','Paris-Lille','12h00','25$','0/40');
INSERT INTO train_bus VALUES(6,'bus','Paris-Lille','13h00','15$','0/40');
INSERT INTO train_bus VALUES(7,'train','Paris-Lille','14h00','25$','0/40');
INSERT INTO train_bus VALUES(8,'bus','Paris-Lille','15h00','15$','0/40');
INSERT INTO train_bus VALUES(9,'train','Paris-Lille','16h00','25$','0/40');
INSERT INTO train_bus VALUES(10,'bus','Paris-Lille','17h00','15$','0/40');
INSERT INTO train_bus VALUES(11,'train','Paris-Lille','18h00','25$','0/40');
INSERT INTO train_bus VALUES(12,'bus','Paris-Lille','19h00','15$','0/40');
INSERT INTO train_bus VALUES(13,'train','Paris-Lille','20h00','25$','0/40');
INSERT INTO train_bus VALUES(14,'bus','Paris-Lille','21h00','15$','0/40');
INSERT INTO train_bus VALUES(15,'train','Paris-Lille','22h00','25$','0/40');

INSERT INTO users VALUES(1,'kobe','bryant','kobebryant@gmail.com','12/08/78','blackmamba','0612131415',7);
INSERT INTO users VALUES(2,'lionel','messi','lapulga@gmail.com','12/09/87','pulga10','0612131415',5);


