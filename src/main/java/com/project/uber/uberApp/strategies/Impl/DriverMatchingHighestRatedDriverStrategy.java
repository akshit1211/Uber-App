package com.project.uber.uberApp.strategies.Impl;

import com.project.uber.uberApp.entities.Driver;
import com.project.uber.uberApp.entities.RideRequest;
import com.project.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
