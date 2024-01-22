package com.jpa.springdatajpa.controller;

import com.jpa.springdatajpa.entity.Phone;
import com.jpa.springdatajpa.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping ("/phones/search")
    public List<Phone> searchPhones(@RequestParam String keyword) {
        return phoneService.search(keyword);
    }
}
