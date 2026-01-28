package com.lld.designPatterns.Observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProgressLogger implements FitnessDataObserver{
    @Override
    public void notifyObservers(PublisherData data) {
        log.info("ProgressBar data of total Steps: "+ data.steps);
    }
}
