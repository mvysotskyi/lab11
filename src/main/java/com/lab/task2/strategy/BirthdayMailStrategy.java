package com.lab.task2.strategy;

import com.lab.task2.Client;

public class BirthdayMailStrategy implements MailStrategy {
    @Override
    public String sendMail(Client client) {
       return "Sending birthday greetings to " + client.getName();
        // Actual logic for sending birthday greetings
    }
}