package com.auto.dealeraudit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.auto.dealeraudit.dto.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
