package com.jpa.springdatajpa.repository;

import com.jpa.springdatajpa.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface PhoneRepository extends JpaRepository<Phone,Integer>, JpaSpecificationExecutor<Phone> {

    List<Phone> findByPhoneName(String keyword);
}
