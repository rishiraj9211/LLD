package com.lld.designPatterns.Observer;

public interface Publisher{

    void registerObserver(FitnessDataObserver obs);
    void removerObserver(FitnessDataObserver obs);
    void notifyObservers();
}