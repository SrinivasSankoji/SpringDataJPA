package com.springdatajpa.inheritance.service;

import com.springdatajpa.inheritance.dto.ArtDTO;
import com.springdatajpa.inheritance.dto.Painting;
import com.springdatajpa.inheritance.entity.Paint;

public interface ArtService {

    Paint createPaint(ArtDTO artDTO);

}
