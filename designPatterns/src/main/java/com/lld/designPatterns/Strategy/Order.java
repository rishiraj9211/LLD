package com.lld.designPatterns.Strategy;

public class Order {

    public long weight;
    public long rate;

    Order(int weight, int rate){
        this.weight = weight;
        this.rate = rate;
    }
}
