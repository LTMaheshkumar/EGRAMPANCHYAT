package com.cdac.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long citizenId;

    @Column(unique = true, nullable = false)
    private String srNo;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false, length = 12)
    private String aadhaarNo;

    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(length = 10)
    private String mobileNo;

    private String email;

    private String addressLine;

    private Integer wardNo;

    private String villageName;

    private String pincode;

    private Boolean isActive = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

