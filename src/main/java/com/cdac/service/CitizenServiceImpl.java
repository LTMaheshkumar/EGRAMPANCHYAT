package com.cdac.service;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.cdac.dto.CitizenRequestDto;
import com.cdac.entities.Citizens;
import com.cdac.repository.CitizenRepository;

@Service
public class CitizenServiceImpl implements CitizenService {

    private final CitizenRepository citizenRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    public CitizenServiceImpl(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    @Override
    public Citizens registerCitizen(CitizenRequestDto dto) {

        if (citizenRepository.existsByAadhaarNo(dto.getAadhaarNo())) {
            throw new RuntimeException("Citizen already exists");
        }

        Citizens citizen = modelMapper.map(dto, Citizens.class);
        citizen.setIsActive(true);
       

        return citizenRepository.save(citizen);
    }
}
