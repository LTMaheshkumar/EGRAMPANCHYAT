package com.cdac.service;

import com.cdac.dto.PanchayatMemberDto;
import com.cdac.entities.PanchayatMember;

public interface PanchayatMemberService {

    PanchayatMember addMember(PanchayatMemberDto dto);
}
