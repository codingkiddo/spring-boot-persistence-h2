package com.codingkiddo.spring_boot_persistence_h2.dao;

import org.springframework.data.repository.CrudRepository;

import com.codingkiddo.spring_boot_persistence_h2.models.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}