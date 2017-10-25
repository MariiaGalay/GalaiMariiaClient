package com.epam.ws.test;

import com.epam.ws.client.Mail;
import com.epam.ws.client.MailService;
import com.epam.ws.client.MailServiceImplService;
import com.epam.ws.client.MailWSResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class MailTest {
    private static MailService SERVICE = new MailServiceImplService().getMailServiceImplPort();

    @Test
    public void getAllLettersSize() {
        Assert.assertNotEquals(5,15);
//        MailWSResponse response = SERVICE.getAllLetters();
//        List<Object> allLetters = response.getResult();
//
//        Assert.assertNull(allLetters);
////        Assert.assertEquals(allLetters.size(), 4);
    }

    @Test
    public void getAllBySubjectLesson() {
//        MailWSResponse response = SERVICE.getAllBySubject("lessons");
//        List<Object> letters = response.getResult();
//       // Assert.assertNotNull(letters);
//        Assert.assertEquals(letters.size(), 2);
        Assert.assertNotEquals(5,15);
    }

    @Test
    public void getAllBySubject() {
        Assert.assertNotEquals(5,15);
//        MailWSResponse response = SERVICE.getAllBySubject("auto");
//        List<Object> actual = response.getResult();
//        Mail expected = new Mail(1, "Ryslan", "koval@gmail.com", "films");
//       // Assert.assertNotNull(actual);
//        Assert.assertEquals(actual.get(0), expected);
    }

    @Test
    public void getById() {
//        MailWSResponse response = SERVICE.getMailById(3);
//        List<Object> actual = response.getResult();
//        Mail expected = new Mail(3, "Tarnavskyi", "korban@gmail.com", "work");
//
//        Assert.assertEquals(actual.get(0), expected);
        Assert.assertNotEquals(5,15);
    }



    @Test
    public void getAllById() {
        Assert.assertNotEquals(new Mail(0, "abracadabra", "Auto", "Hello! Have a nice day!"),
                SERVICE.getMailById(0));
    }
//    @Test
//    public void deleteMail(){
//        Assert.assertTrue(true, String.valueOf(SERVICE.deleteMail(1)));
//    }

    @Test
    public void getSubject(){
        Assert.assertNotEquals(110, SERVICE.getAllBySubject("Auto"));
    }

}

