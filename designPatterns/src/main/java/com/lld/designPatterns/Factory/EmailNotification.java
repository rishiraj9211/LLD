package com.lld.designPatterns.Factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotification implements NotificationService{
    @Override
    public void send(String mesg) {
        log.info("Sending Email Notification");
    }
}
