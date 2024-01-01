package com.example.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "credential_info")
public class CredentialData {
    @Id
    private String vendorId;
    private String vendorEmail;
    private String vendorPassword;

    @OneToOne(mappedBy = "credentialData")
    private CloudVendor cloudVendor;
    public CredentialData() {
    }

    public CredentialData(String vendorId, String vendorEmail, String vendorPassword) {
        this.vendorId = vendorId;
        this.vendorEmail = vendorEmail;
        this.vendorPassword = vendorPassword;
    }
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }


}
