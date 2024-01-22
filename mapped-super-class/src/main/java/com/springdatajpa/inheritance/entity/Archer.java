package com.springdatajpa.inheritance.entity;

import com.springdatajpa.inheritance.dto.InfantryType;
import com.springdatajpa.inheritance.model.Infantry;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Value;

@Entity
@Value
public class Archer extends Infantry {

    Integer range;

    @Builder
    public Archer(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(infantryType, moveSpeed, durability, attack);
        this.range = range;
    }
}
