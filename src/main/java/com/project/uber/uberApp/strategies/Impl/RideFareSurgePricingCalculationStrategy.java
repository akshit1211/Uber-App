package com.project.uber.uberApp.strategies.Impl;

import com.project.uber.uberApp.dto.RideRequestDto;
import com.project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
