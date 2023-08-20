package com.springdatajpa.inheritance.controller;

import com.springdatajpa.inheritance.dto.ArtDTO;
import com.springdatajpa.inheritance.entity.Paint;
import com.springdatajpa.inheritance.service.ArtService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/art")
@AllArgsConstructor
public class ArtController {

    private ArtService artService;

    @PostMapping ("/create/paint")
    public ResponseEntity<Paint> createUser(@RequestBody ArtDTO artDTO) {
        Paint paint = artService.createPaint(artDTO);
        return new ResponseEntity<>(paint, HttpStatus.OK);
    }
}
