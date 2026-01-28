package com.lld.designPatterns.Strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlatRate implements CostCalculator{
    private final int rate;
    FlatRate(int rate){
        this.rate = rate;
    }
    @Override
    public long calculateTotalCost(Order order) {
        log.info("Calculating flat rate");
        return rate+ order.rate;
    }
}
