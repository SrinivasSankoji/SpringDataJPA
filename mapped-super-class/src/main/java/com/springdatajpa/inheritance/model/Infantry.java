package com.springdatajpa.inheritance.model;

import com.springdatajpa.inheritance.dto.InfantryType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.util.UUID;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Infantry {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    UUID id;

    @Enumerated (value = EnumType.STRING)
    InfantryType infantryType;

    Integer moveSpeed;

    Integer durability;

    Integer attack;

    public Infantry() {
    }

    public Infantry(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack) {
        this.infantryType = infantryType;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
