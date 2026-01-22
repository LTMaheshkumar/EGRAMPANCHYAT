package com.cdac.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.GrampanchayatDto;
import com.cdac.entities.Grampanchayat;
import com.cdac.service.GrampanchayatService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/grampanchayat")
@AllArgsConstructor
public class GrampanchayatController {

    private final GrampanchayatService grampanchayatService;

    // controller depends on service layer

    @PostMapping("/add")
    public ResponseEntity<?> addGrampanchayat(
            @RequestBody GrampanchayatDto dto) {

        Grampanchayat savedGp =
                grampanchayatService.addGrampanchayat(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedGp);
    }
}
