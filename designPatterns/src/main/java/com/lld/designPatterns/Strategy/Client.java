package com.lld.designPatterns.Strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args){
        Order order1 = new Order(10,15);

        WeightedCost wc = new WeightedCost(13);
        FlatRate fr = new FlatRate(100);

        ShippingCostService ss= new ShippingCostService(wc);
        log.info("Cost for weighted: "+ ss.calculateCost(order1));

        ss.setStrategey(fr);
        log.info("Cost for Flat Rate is: "+ ss.calculateCost(order1));


    }

}
