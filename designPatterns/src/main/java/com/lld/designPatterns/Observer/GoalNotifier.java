package com.lld.designPatterns.Observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoalNotifier implements FitnessDataObserver{
    @Override
    public void notifyObservers(PublisherData data) {
        log.info("Goal Notifier reached total calories " + data.calories);
    }
}
