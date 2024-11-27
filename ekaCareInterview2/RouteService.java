package org.example.practice.ekaCareInterview2;

import java.util.Comparator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class RouteService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private TrainRepository trainRepository;
    @Autowired
    private FlightRepository flightRepository;

    public Route getBestRoute(String from, String to, String criteria) {
        List<Route> allRoutes = new ArrayList<>();

        // Fetch all routes from repositories
        allRoutes.addAll(carRepository.findByFromAndTo(from, to));
        allRoutes.addAll(trainRepository.findByFromAndTo(from, to));
        allRoutes.addAll(flightRepository.findByFromAndTo(from, to));

        // Sort based on the criteria
        return allRoutes.stream()
                .min(criteria.equals("price")
                        ? Comparator.comparingDouble(Route::getPrice)
                        : Comparator.comparingLong(Route::getDuration))
                .orElse(null);
    }
}
