package org.example.practice.ekaCareInterview2;

public interface Route {
    String getFrom();
    String getTo();
    double getPrice();
    long getDuration(); // Duration in minutes
}
