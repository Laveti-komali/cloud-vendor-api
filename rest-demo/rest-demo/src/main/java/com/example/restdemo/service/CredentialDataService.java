package com.example.restdemo.service;

import com.example.restdemo.model.CredentialData;
import com.example.restdemo.repository.CredentialDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialDataService {

    private final CredentialDataRepository credentialDataRepository;

    @Autowired
    public CredentialDataService(CredentialDataRepository credentialDataRepository) {
        this.credentialDataRepository = credentialDataRepository;
    }

    public String getEmailByVendorId(String vendorId) {
        CredentialData credentialData = credentialDataRepository.findByVendorId(vendorId);
        if (credentialData != null) {
            return credentialData.getVendorEmail();
        } else {
            return null;
        }
    }

    public String addExtraDetails(CredentialData credentialData){
        credentialDataRepository.save(credentialData);
        return "Success";
    }
}

