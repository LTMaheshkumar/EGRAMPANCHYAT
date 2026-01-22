package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cdac.entities.PanchayatMember;

public interface PanchayatMemberRepository
        extends JpaRepository<PanchayatMember, Long> {
}
