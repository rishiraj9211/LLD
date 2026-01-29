package com.lld.designPatterns.Factory;

public class Factory {

    public NotificationService getObject(String type) throws Exception {
        switch (type.toLowerCase()){
            case "teams": return new TeamsNotification();
            case "whatsapp": return new WhatsAppNotification();
            case "email": return new EmailNotification();
            default: throw new Exception("No channel found");
        }
    }
}
