package com.springdatajpa.inheritance.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

import java.util.UUID;

@MappedSuperclass
@Getter
public class Vehicle {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    UUID vehicleId;
    String vehicleName;
    Integer seatingCapacity;


    public Vehicle() {
    }

    public Vehicle(String vehicleName, Integer seatingCapacity) {
        this.vehicleName = vehicleName;
        this.seatingCapacity = seatingCapacity;
    }
}
