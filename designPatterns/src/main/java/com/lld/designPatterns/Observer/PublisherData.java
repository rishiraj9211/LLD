package com.lld.designPatterns.Observer;

import com.lld.designPatterns.Observer.Publisher;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PublisherData implements Publisher {
    public int steps;
    public int activeMinutes;
    public int calories;

    PublisherData(int steps, int activeTime, int calories){
        this.steps = steps;
        this.activeMinutes = activeTime;
        this.calories = calories;
        observers = new ArrayList<>();
        checkSteps();
    }

    List<FitnessDataObserver> observers;

    PublisherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(FitnessDataObserver obs){
        observers.add(obs);
    }

    @Override
    public void removerObserver(FitnessDataObserver obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(FitnessDataObserver obs: observers){
            obs.notifyObservers(this);
        }
    }

    private void checkSteps(){
        if(steps>100){
            notifyObservers();
        }
    }




}