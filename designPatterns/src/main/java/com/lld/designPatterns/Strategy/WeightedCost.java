package com.lld.designPatterns.Strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeightedCost implements CostCalculator{
    private final int costPerKg;

    WeightedCost(int rate){
        this.costPerKg = rate;
    }
    @Override
    public long calculateTotalCost(Order order) {
        log.info("Calculating weight per kg");
        return order.weight* costPerKg;
    }
}
