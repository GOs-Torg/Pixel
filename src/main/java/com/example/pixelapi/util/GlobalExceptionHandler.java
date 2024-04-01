package com.example.pixelapi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.logging.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {

//    @Autowired
//    private EmailSenderService senderService;
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> handleNullPointerException(Exception e)
    {
        Logger.getLogger(this.getClass().getName()).info("error");
//        senderService.SendMessage("pavelnefedov3@gmail.com",
//                "Application error",
//                e.getMessage());
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        return new ResponseEntity("error", status);
    }
}
