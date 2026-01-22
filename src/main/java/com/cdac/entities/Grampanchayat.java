package com.cdac.entities;

import jakarta.persistence.*;   
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Entity
@Table(name = "grampanchayat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grampanchayat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gp_id")
    private Long gpId;

    @Column(nullable = false)
    private String name;

    private String address;
    private String district;
    private String state;
    private String pincode;

    @Column(name = "annual_budget")
    private Double annualBudget;

    private Integer establishedYear;

    private Boolean isActive = true;
}
