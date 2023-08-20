package com.springdatajpa.inheritance.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Value;

@Entity (name = "truck")
@Value
public class Truck extends Vehicle {
    Integer maxLoad;
    boolean sleeperCab;

    @Builder
    public Truck(String vehicleName, Integer seatingCapacity, Integer maxLoad, boolean sleeperCab) {
        super(vehicleName, seatingCapacity);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
