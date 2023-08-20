package com.springdatajpa.inheritance.repository;

import com.springdatajpa.inheritance.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle, UUID> {
}
