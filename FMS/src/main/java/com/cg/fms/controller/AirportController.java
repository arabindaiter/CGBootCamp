package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.Airport;

import com.cg.fms.service.AirportService;

@RestController
public class AirportController 
{
	@Autowired
    private AirportService airportService;
	
	@PostMapping(value = "/airport")
	private Airport addAirport(@RequestBody Airport airport){
    	
    	System.out.println("airport:"+airport);
        return airportService.addAirport(airport);
	}

    @GetMapping(value = "/airport")
    private List<Airport> viewAllAirport(){
        return airportService.viewAllAirport();
    }

    @GetMapping(value = "/airport/{airportCode}")
    private Airport viewAirport(@PathVariable(value = "airportCode") String airpotCode){
        Airport airport = airportService.viewAirport(airpotCode);
        return airport == null ? new Airport() : airport;
    }

}
