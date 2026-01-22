package com.cdac.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.cdac.dto.PanchayatMemberDto;
import com.cdac.entities.Grampanchayat;
import com.cdac.entities.PanchayatMember;
import com.cdac.entities.Ward;
import com.cdac.repository.GrampanchayatRepository;
import com.cdac.repository.PanchayatMemberRepository;
import com.cdac.repository.WardRepository;
import com.cdac.service.PanchayatMemberService;  

@Service
@AllArgsConstructor
public class PanchayatMemberServiceImpl implements PanchayatMemberService {

    private final PanchayatMemberRepository memberRepository;
    private final WardRepository wardRepository;
    private final GrampanchayatRepository grampanchayatRepository;
    private final ModelMapper modelMapper;

    @Override
    public PanchayatMember addMember(PanchayatMemberDto dto) {

        Ward ward = wardRepository.findById(dto.getWardNo())
                .orElseThrow(() -> new RuntimeException("Ward not found"));

        Grampanchayat gp = grampanchayatRepository.findById(dto.getGpId())
                .orElseThrow(() -> new RuntimeException("Grampanchayat not found"));

        PanchayatMember member =
                modelMapper.map(dto, PanchayatMember.class);

        member.setWard(ward);
        member.setGrampanchayat(gp);

        return memberRepository.save(member);
    }
}
