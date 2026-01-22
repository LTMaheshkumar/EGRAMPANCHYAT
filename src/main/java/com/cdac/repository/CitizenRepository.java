package com.cdac.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entities.Citizens;

public interface CitizenRepository extends JpaRepository<Citizens, Long> {

    boolean existsByAadhaarNo(String aadhaarNo);
}
