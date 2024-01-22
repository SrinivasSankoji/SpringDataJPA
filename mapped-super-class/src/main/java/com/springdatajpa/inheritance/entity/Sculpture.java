package com.springdatajpa.inheritance.entity;

import com.springdatajpa.inheritance.dto.Material;
import com.springdatajpa.inheritance.model.Art;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Entity
@Value
@DiscriminatorValue (value = "SCULPTURE")
@SuperBuilder
public class Sculpture extends Art {

    @Enumerated (value = EnumType.STRING)
    Material material;

    Double weight;
}
