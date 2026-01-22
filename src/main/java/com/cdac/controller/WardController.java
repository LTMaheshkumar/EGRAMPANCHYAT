package com.cdac.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.WardDto;
import com.cdac.entities.Ward;
import com.cdac.service.WardService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/ward")
@AllArgsConstructor
public class WardController {

    private final WardService wardService;

   
    @PostMapping("/add")
    public ResponseEntity<?> addWard(@RequestBody WardDto dto) {

        Ward savedWard = wardService.addWard(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedWard);
    }
}
