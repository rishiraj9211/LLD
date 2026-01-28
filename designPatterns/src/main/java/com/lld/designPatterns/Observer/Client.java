package com.lld.designPatterns.Observer;

public class Client{

    public static void main(String[] args){
        PublisherData publisher = new PublisherData(150,150,150);

        LiveActivityDisplay liveData = new LiveActivityDisplay();
        ProgressLogger progress = new ProgressLogger();
        GoalNotifier goal = new GoalNotifier();

        publisher.registerObserver(liveData);
        publisher.registerObserver(progress);
        publisher.registerObserver(goal);
        publisher.notifyObservers();

    }
}