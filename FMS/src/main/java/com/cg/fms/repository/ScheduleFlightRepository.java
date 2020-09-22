package com.cg.fms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Flight;
import com.cg.fms.dto.Schedule;
import com.cg.fms.dto.ScheduledFlight;

public interface ScheduleFlightRepository extends JpaRepository<ScheduledFlight, Integer>
{

	Optional<ScheduledFlight> findBySchedule(Schedule schedule);

    List<ScheduledFlight> findByFlight(Flight flight);
}
