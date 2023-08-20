package com.springdatajpa.inheritance.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ArtDTO {

    String author;

    Double width;

    Double height;

    Double weight;
}
