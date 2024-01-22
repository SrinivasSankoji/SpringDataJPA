package com.springdatajpa.inheritance.entity;

import com.springdatajpa.inheritance.dto.InfantryType;
import com.springdatajpa.inheritance.model.Infantry;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Value;

@Entity
@Value
public class Knight extends Infantry {

     Boolean shield;


    @Builder
    public Knight(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
        super(infantryType, moveSpeed, durability, attack);
        this.shield = shield;
    }
}
