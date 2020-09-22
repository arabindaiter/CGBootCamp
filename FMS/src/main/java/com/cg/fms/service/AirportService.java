package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.dto.Airport;

@Service
public interface AirportService {
	
	Airport addAirport(Airport airport);

	List<Airport> viewAllAirport();

	Airport viewAirport(String airpotCode);

}
