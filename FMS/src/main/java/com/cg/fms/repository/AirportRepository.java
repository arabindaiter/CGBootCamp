package com.cg.fms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Airport;


public interface AirportRepository extends JpaRepository<Airport, Integer>{

	@SuppressWarnings("unchecked")
	Airport save(Airport airport);
	Optional<Airport> findByAirportCode(String airpotCode);

}
