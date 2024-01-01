package com.example.restdemo.controller;

import com.example.restdemo.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/MailSender")
public class MailController {
    @Autowired
    private EmailSenderService emailSenderService;
    @PostMapping()
    public String MailerSender(@RequestBody String mail){
        return emailSenderService.sendEmail(mail,"Cloud Vendor account remainder","Your account has been deleted successfully, Thank you!");
    }
    @PostMapping("/updatemail")
    public String MailerUpdateSender(@RequestBody String mail){
        return emailSenderService.sendEmail(mail,"Cloud Vendor account remainder","Your account has been updated successfully, Thank you!");
    }
}
