package com.pagination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
public class Address implements Serializable {
    @Serial
    private static final long serialVersionUID = 3611853231530717015L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;
    String address;
    String city;
    String state;
    String zip;

    public Address() {
    }

    public Address(String address, String city, String state, String zip) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
