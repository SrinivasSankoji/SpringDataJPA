package com.springdatajpa.inheritance.repository;

import com.springdatajpa.inheritance.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TruckRepository extends VehicleRepository {
}
