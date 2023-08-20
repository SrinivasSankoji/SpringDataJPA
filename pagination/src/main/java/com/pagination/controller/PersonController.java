package com.pagination.controller;


import com.pagination.entity.Person;
import com.pagination.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/people")
@AllArgsConstructor
public class PersonController {

    PersonRepository personRepository;

    @GetMapping
    public Page<Person> getAllPersonDetails(Pageable pageable) {
      return  personRepository.findAll(pageable);
    }
}
