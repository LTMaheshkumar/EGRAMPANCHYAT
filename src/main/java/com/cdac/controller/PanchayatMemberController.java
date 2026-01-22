package com.cdac.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.PanchayatMemberDto;
import com.cdac.entities.PanchayatMember;
import com.cdac.service.PanchayatMemberService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/member")
@AllArgsConstructor
public class PanchayatMemberController {

    private final PanchayatMemberService memberService;

    
    @PostMapping("/add")
    public ResponseEntity<?> addMember(
            @RequestBody PanchayatMemberDto dto) {

        PanchayatMember savedMember =
                memberService.addMember(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedMember);
    }
}
