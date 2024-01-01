package com.example.restdemo.repository;

import com.example.restdemo.model.CredentialData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CredentialDataRepository extends JpaRepository<CredentialData, String> {
    CredentialData findByVendorId(String vendorId);

    @Query("SELECT c.vendorEmail FROM CredentialData c WHERE c.vendorId = :vendorId")
    String findEmailByVendorId(@Param("vendorId") String vendorId);



}
