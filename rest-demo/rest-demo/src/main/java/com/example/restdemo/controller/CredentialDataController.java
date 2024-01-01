package com.example.restdemo.controller;

import com.example.restdemo.model.CredentialData;
import com.example.restdemo.service.CredentialDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredentialDataController {
    private CredentialDataService credentialDataService;
    @Autowired
    public CredentialDataController(CredentialDataService credentialDataService) {
        this.credentialDataService = credentialDataService;
    }
    @GetMapping("/getEmail/{vendorId}")
    public String getEmailFromId(@PathVariable("vendorId") String id){
        return credentialDataService.getEmailByVendorId(id);
    }
    @PostMapping("/extra")
    public String sendExtraData(CredentialData credentialData){
        return credentialDataService.addExtraDetails(credentialData);
    }
}
