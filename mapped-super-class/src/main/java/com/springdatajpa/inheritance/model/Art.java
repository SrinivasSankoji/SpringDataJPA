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

import java.util.UUID;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "ART_TYPE", discriminatorType = DiscriminatorType.STRING)
@Getter
public abstract class Art {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID artId;
    private String author;

    public Art() {
    }
    public Art(String author) {
        this.author = author;
    }
}
