package org.example.practice.ekaCareInterview2;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByFromAndTo(String from, String to);
}
