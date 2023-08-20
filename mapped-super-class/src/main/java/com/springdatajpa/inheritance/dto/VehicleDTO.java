package com.springdatajpa.inheritance.dto;


import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class VehicleDTO {

    String vehicleName;
    Integer seatingCapacity;
    private Integer firePower;
    private Integer maxLoad;
    private boolean sleeperCab;
}
