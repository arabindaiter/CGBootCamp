package com.cg.fms.service;

import java.util.Date; 
import java.util.List;

import com.cg.fms.dto.Airport;
import com.cg.fms.dto.Flight;
import com.cg.fms.dto.Schedule;
import com.cg.fms.dto.ScheduledFlight;

public interface ScheduledFlightService {

	ScheduledFlight saveScheduleFlight(ScheduledFlight scheduledFlight);

	List<ScheduledFlight> viewScheduledFlight();

	List<ScheduledFlight> viewScheduledFlights(Long flightno);

	void deleteScheduledFlight(Integer scheduleFlightId);

	ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, Integer id);

	List<ScheduledFlight> viewScheduledFlights(Airport toAirport, Airport fromAirport, Date date);

}
