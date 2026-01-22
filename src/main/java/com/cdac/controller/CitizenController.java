package com.cdac.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.CitizenRequestDto;
import com.cdac.service.CitizenService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/citizens")
public class CitizenController {

    private final CitizenService citizenService;

    public CitizenController(CitizenService citizenService) {
        this.citizenService = citizenService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @Valid
            @RequestBody CitizenRequestDto dto) {

        return ResponseEntity.ok(citizenService.registerCitizen(dto));
    }
}
