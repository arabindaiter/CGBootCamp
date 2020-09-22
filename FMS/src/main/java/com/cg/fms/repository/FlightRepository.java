package com.cg.fms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long>
{
	@SuppressWarnings("unchecked")
	Flight save(Flight flight);

}
