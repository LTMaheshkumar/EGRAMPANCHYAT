package com.cdac.service;


import com.cdac.dto.CitizenRequestDto;
import com.cdac.entities.Citizens;

public interface CitizenService {
    Citizens registerCitizen(CitizenRequestDto dto);
}


