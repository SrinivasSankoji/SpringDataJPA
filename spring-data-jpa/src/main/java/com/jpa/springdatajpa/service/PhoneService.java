package com.jpa.springdatajpa.service;

import com.jpa.springdatajpa.entity.Phone;
import com.jpa.springdatajpa.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService {

    @Autowired
    PhoneRepository phoneRepository;

    public List<Phone> search(String keyword) {
        return phoneRepository.findByPhoneName("%" + keyword + "%");
    }


}
