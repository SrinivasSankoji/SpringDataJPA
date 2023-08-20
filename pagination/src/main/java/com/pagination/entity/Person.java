package com.pagination.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Value;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -2996788844738857771L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Integer id;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "address_id", referencedColumnName = "id")
    Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
}
