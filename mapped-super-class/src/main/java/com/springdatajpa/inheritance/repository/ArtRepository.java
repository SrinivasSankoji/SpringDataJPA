package com.springdatajpa.inheritance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface ArtRepository extends CrudRepository<com.springdatajpa.inheritance.model.Art, UUID> {
}
