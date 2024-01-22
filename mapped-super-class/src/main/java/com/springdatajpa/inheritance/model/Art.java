package com.springdatajpa.inheritance.model;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "ART_TYPE", discriminatorType = DiscriminatorType.STRING)
@Getter
@SuperBuilder
public abstract class Art {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    UUID artId;

    String author;

    String name;

    String firstName;

    String lastName;

    String address;

    String qualification;

    String experience;

    public Art() {
    }
}
