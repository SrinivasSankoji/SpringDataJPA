package com.springdatajpa.inheritance.entity;

import com.springdatajpa.inheritance.dto.Material;
import com.springdatajpa.inheritance.model.Art;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Value;

@Entity
@Value
@DiscriminatorValue (value = "SCULPTURE")
public class Sculpture extends Art {

    @Enumerated (value = EnumType.STRING)
    Material material;

    Double weight;

    @Builder
    public Sculpture(String author, Material material, Double weight) {
        super(author);
        this.material = material;
        this.weight = weight;
    }
}
