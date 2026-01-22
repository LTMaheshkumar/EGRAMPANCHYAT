package com.cdac.dto;

import java.time.LocalDate;

import com.cdac.entities.Gender;

public class CitizenRequestDto {

    private String fullName;
    private String aadhaarNo;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String mobileNo;
    private String email;
    private String addressLine;
    private Integer wardNo;
    private String villageName;
    private String pincode;
}

