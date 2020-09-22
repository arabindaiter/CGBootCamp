package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Flight;

public interface FlightService 
{

	Flight addFlight(Flight flight);

	Flight viewFlightByFlightNo(Long flightno);

	List<Flight> viewFlight();

	Flight modifyFlight(Flight flight);

	void deleteFlight(Long flightno);
	

}
