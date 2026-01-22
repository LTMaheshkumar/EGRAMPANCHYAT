package com.cdac.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.cdac.dto.WardDto;
import com.cdac.entities.Grampanchayat;
import com.cdac.entities.Ward;
import com.cdac.repository.GrampanchayatRepository;
import com.cdac.repository.WardRepository;

@Service
@AllArgsConstructor
public class WardServiceImpl implements WardService {

    private final WardRepository wardRepository;
    private final GrampanchayatRepository grampanchayatRepository;
    private final ModelMapper modelMapper;

    @Override
    public Ward addWard(WardDto dto) {

        Grampanchayat gp =
            grampanchayatRepository.findById(dto.getGpId())
            .orElseThrow(() -> new RuntimeException("Grampanchayat not found"));

        Ward ward = modelMapper.map(dto, Ward.class);
        ward.setGrampanchayat(gp);

        return wardRepository.save(ward);
    }
}
