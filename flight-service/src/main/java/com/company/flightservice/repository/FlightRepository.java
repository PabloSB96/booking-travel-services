package com.company.flightservice.repository;

import com.company.flightservice.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FlightRepository extends JpaRepository<Flight, UUID> {
    public List<Flight> findAllByRemainingSeatsGreaterThan(Long remainingSeats);
}
