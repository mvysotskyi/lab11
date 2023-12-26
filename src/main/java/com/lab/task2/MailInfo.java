package com.lab.task2;

import com.lab.task2.strategy.MailStrategy;

public class MailInfo {
    private Client client;
    private MailStrategy mailStrategy;

    public MailInfo(Client client, MailStrategy mailStrategy) {
        this.client = client;
        this.mailStrategy = mailStrategy;
    }

    public Client getClient() {
        return client;
    }

    public String sendMail() {
        return mailStrategy.sendMail(client);
    }
}