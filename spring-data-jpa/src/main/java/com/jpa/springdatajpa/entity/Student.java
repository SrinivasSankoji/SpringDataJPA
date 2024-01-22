package com.jpa.springdatajpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;

    @Column (name = "name")
    @JsonProperty("name")
    private String name;

    @Column (name = "roll_number")
    @JsonProperty("rollNumber")
    private String rollNumber;

    @Column (name = "university")
    @JsonProperty("university")
    private String university;
}
