package com.springdatajpa.inheritance.service;

import com.springdatajpa.inheritance.dto.ArtDTO;
import com.springdatajpa.inheritance.dto.Painting;
import com.springdatajpa.inheritance.entity.Paint;
import com.springdatajpa.inheritance.repository.PaintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ArtServiceImpl implements ArtService{

    private PaintRepository paintRepository;

    @Override
    public Paint createPaint(ArtDTO artDTO) {
        return paintRepository.save(Paint.builder().author("Srinivas").painting(Painting.WATERCOLOR)
                        .width(30.0)
                        .height(40.0)
                .build());
    }
}
