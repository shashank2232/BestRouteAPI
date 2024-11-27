package org.example.practice.ekaCareInterview2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car implements Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String from;
    private String to;
    private double price;
    private long duration;

    // Getters and Setters
    @Override
    public String getFrom() { return from; }
    @Override
    public String getTo() { return to; }
    @Override
    public double getPrice() { return price; }
    @Override
    public long getDuration() { return duration; }
}

