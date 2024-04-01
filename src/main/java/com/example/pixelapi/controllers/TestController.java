//package com.example.pixelapi.controllers;
//
//import com.example.pixelapi.util.EmailSenderService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//
//@RestController
//@RequestMapping("/api/test")
//public class TestController {
//    @Autowired
//            private EmailSenderService senderService;
//    Logger logger = LoggerFactory.getLogger(TestController.class.getName());
//    @GetMapping("/sendError")
//    public String sendError(){
//        senderService.SendMessage("pavelnefedov3@gmail.com", "test","test");
//        return "error";
//    }
//}
