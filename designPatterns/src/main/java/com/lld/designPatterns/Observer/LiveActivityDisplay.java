package com.lld.designPatterns.Observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LiveActivityDisplay implements FitnessDataObserver{
    @Override
    public void notifyObservers(PublisherData data) {
        log.info("Live Activity received data of: "+ data.activeMinutes);
    }
}
