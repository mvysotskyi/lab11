package com.lab.task2.strategy;

import com.lab.task2.Client;

public class GiftMailStrategy implements MailStrategy {
    @Override
    public String sendMail(Client client) {
        return "Sending gift letter to " + client.getName();
    }
}