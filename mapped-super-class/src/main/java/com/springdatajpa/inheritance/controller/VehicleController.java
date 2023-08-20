package com.springdatajpa.inheritance.controller;


import com.springdatajpa.inheritance.dto.VehicleDTO;
import com.springdatajpa.inheritance.model.Tank;
import com.springdatajpa.inheritance.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/vehicle")
@AllArgsConstructor
public class VehicleController {

    VehicleService vehicleService;

    @PostMapping ("/create/tank")
    public ResponseEntity<Tank> createUser(@RequestBody VehicleDTO vehicleDTO) {
        Tank tank = vehicleService.create(vehicleDTO);
        return new ResponseEntity<>(tank, HttpStatus.OK);
    }


}
