package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cdac.entities.Grampanchayat;

public interface GrampanchayatRepository 
        extends JpaRepository<Grampanchayat, Long> {
}
