package com.lab.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender sender;

    public MailBox() {
        this.infos = new ArrayList<>();
        this.sender = new MailSender();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        for (MailInfo mailInfo : infos) {
            sender.sendMail(mailInfo);
        }
        infos.clear();
    }
}