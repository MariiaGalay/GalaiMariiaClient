package com.epam.ws.test;

import com.epam.ws.client.MailService;
import com.epam.ws.client.MailServiceImplService;
import com.epam.ws.client.MailWSResponse;

import java.util.List;

public class app {
    private static MailService SERVICE = new MailServiceImplService().getMailServiceImplPort();

    public static void main(String[] args) {
        MailWSResponse response = SERVICE.getAllLetters();
        List<Object> allLetters = response.getResult();
        System.out.println(SERVICE.getAllLetters().getResult());
    }
}
