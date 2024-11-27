package org.example.practice.ekaCareInterview2;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByFromAndTo(String from, String to);
}
