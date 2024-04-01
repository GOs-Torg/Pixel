//package com.example.pixelapi.util;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailSenderService {
//    @Value("${spring.mail.host}")
//    private String host;
//    @Value("${spring.mail.port}")
//    private int port;
//    @Value("${}")
//    private String t;
//    public void SendMessage(String to, String subject, String body){
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost(host);
//        mailSender.setPort(port);
//
//
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("g0storg@yandex.ru");
//        message.setTo(to);
//        message.setText(body);
//        message.setSubject(subject);
//        mailSender.send(message);
//
//    }
//}
