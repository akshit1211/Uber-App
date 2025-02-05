package com.project.uber.uberApp.strategies.Impl;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.entities.RideRequest;
import com.project.uber.uberApp.services.DistanceService;
import com.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
