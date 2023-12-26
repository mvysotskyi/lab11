package com.lab.task2;

import com.lab.task2.strategy.MailStrategy;
import com.lab.task2.strategy.BirthdayMailStrategy;
import com.lab.task2.strategy.GiftMailStrategy;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("John", 25, "Male");
        Client client2 = new Client("Jane", 30, "Female");

        MailStrategy birthdayStrategy = new BirthdayMailStrategy();
        MailStrategy giftStrategy = new GiftMailStrategy();

        MailInfo mailInfo1 = new MailInfo(client1, birthdayStrategy);
        MailInfo mailInfo2 = new MailInfo(client2, giftStrategy);

        MailBox mailBox = new MailBox();

        // Adding mail info to the mailbox
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        // Sending all mails in the mailbox
        mailBox.sendAll();
    }
}
