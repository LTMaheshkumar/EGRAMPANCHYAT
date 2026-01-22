package com.cdac.dto;

import java.time.LocalDate;

import com.cdac.entities.Gender;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CitizenRequestDto {

    // Name
    @NotBlank(message = "Full name is required")
    @Size(min = 3, max = 100, message = "Full name must be between 3 to 100 characters")
    private String fullName;

    // Date of Birth
    @NotNull(message = "Date of birth is required")
    @Past(message = "Date of birth must be in the past")
    private LocalDate dateOfBirth;

    // Gender
    @NotNull(message = "Gender is required")
    private Gender gender;

    // Address
    @NotBlank(message = "Address is required")
    @Size(max = 255, message = "Address cannot exceed 255 characters")
    private String address;

    // Ward No
    @NotNull(message = "Ward number is required")
    private Integer wardNo;

    // Mobile No
    @NotBlank(message = "Mobile number is required")
    @Pattern(regexp = "^[6-9][0-9]{9}$",
             message = "Mobile number must be a valid 10-digit Indian number")
    private String mobileNo;

    // Aadhaar No
    @NotBlank(message = "Aadhaar number is required")
    @Pattern(regexp = "^[0-9]{12}$",
             message = "Aadhaar number must be exactly 12 digits")
    private String aadhaarNo;

    // Email
    @Email(message = "Email must be valid")
    private String email;

    // Active flag (optional from client side)
    private Boolean isActive;
}
