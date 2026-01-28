package com.lld.designPatterns.Strategy;

public class ShippingCostService {

    private CostCalculator costCalculator;
    ShippingCostService(){}
    ShippingCostService(CostCalculator costCalculator){
        this.costCalculator = costCalculator;
    }
    public void setStrategey(CostCalculator costCalculator){
        this.costCalculator = costCalculator;
    }

    public long calculateCost(Order order){
        return costCalculator.calculateTotalCost(order);
    }

}
