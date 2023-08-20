package com.springdatajpa.inheritance.service;

import com.springdatajpa.inheritance.dto.VehicleDTO;
import com.springdatajpa.inheritance.model.Tank;

public interface VehicleService {

    Tank create(VehicleDTO vehicleDTO);

}
