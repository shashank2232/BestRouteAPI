package org.example.practice.ekaCareInterview2;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RouteRepository {
    public List<Route> getAvailableFlights(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("B123",150.0,3.0));
        flights.add(new Flight("A123",180.0,2.5));
        flights.add(new Flight("M123",200.0,4.0));
        return flights;
    }


}
