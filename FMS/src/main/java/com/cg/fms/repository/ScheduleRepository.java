package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Airport;
import com.cg.fms.dto.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{
	List<Schedule> findBySourceAirportAndDestinationAirport(Airport sourceAirport, Airport destinationAirport);


}
