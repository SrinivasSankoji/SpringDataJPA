package com.springdatajpa.inheritance.service;

import com.springdatajpa.inheritance.dto.VehicleDTO;
import com.springdatajpa.inheritance.model.Tank;
import com.springdatajpa.inheritance.repository.TankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    TankRepository tankRepository;

    @Override
    public Tank create(VehicleDTO vehicleDTO) {
        Tank tank = Tank.builder()
                .vehicleName(vehicleDTO.getVehicleName()).seatingCapacity(vehicleDTO.getSeatingCapacity())
                .firePower(vehicleDTO.getFirePower()).build();
        return tankRepository.save(tank);
    }
}
