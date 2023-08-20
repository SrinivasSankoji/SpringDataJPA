package com.springdatajpa.inheritance.entity;

import com.springdatajpa.inheritance.dto.Painting;
import com.springdatajpa.inheritance.model.Art;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Value;

@Entity
@DiscriminatorValue (value = "PAINT")
@Value
public class Paint extends Art {

    @Enumerated (value = EnumType.STRING)
    Painting painting;

    Double width;

    Double height;

    @Builder
    public Paint(String author, Painting painting, Double width, Double height) {
        super(author);
        this.painting = painting;
        this.width = width;
        this.height = height;
    }
}
