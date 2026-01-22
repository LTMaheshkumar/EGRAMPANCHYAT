package com.cdac.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrampanchayatDto {

    private String name;
    private String address;
    private String district;
    private String state;
    private String pincode;
    private Double annualBudget;
    private Integer establishedYear;
}
