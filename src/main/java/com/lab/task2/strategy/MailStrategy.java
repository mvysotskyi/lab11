package com.lab.task2.strategy;

import com.lab.task2.Client;

public interface MailStrategy {
    String sendMail(Client client);
}
