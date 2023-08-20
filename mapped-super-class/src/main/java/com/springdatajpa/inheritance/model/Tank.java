package com.springdatajpa.inheritance.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Value;

@Entity (name = "tank")
@Value
public class Tank extends Vehicle {

    Integer firePower;

    @Builder
    public Tank(String vehicleName, Integer seatingCapacity, Integer firePower) {
        super(vehicleName, seatingCapacity);
        this.firePower = firePower;
    }

}
