package com.demospring.backend.dao;

import com.demospring.backend.entities.Prof;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepository extends JpaRepository<Prof, Long> {
}
