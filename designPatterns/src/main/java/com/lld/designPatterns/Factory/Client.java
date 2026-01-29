package com.lld.designPatterns.Factory;

public class Client {

    public static void main(String[] args) throws Exception {
        Factory factory = new Factory();
        NotificationService notification = factory.getObject("email");
        notification.send("sending email");
    }
}
