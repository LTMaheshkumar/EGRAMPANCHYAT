package com.cdac.service;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.cdac.dto.GrampanchayatDto;
import com.cdac.entities.Grampanchayat;
import com.cdac.repository.GrampanchayatRepository;
import com.cdac.service.GrampanchayatService;

@Service
@AllArgsConstructor
public class GrampanchayatServiceImpl implements GrampanchayatService {

    private final GrampanchayatRepository grampanchayatRepository;
    private final ModelMapper modelMapper;

    @Override
    public Grampanchayat addGrampanchayat(GrampanchayatDto dto) {

        Grampanchayat gp =
                modelMapper.map(dto, Grampanchayat.class);

        // server-side control (security)
        gp.setIsActive(true);

        return grampanchayatRepository.save(gp);
    }
}
