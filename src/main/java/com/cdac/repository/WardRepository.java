package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cdac.entities.Ward;

public interface WardRepository extends JpaRepository<Ward, Integer> {
}
