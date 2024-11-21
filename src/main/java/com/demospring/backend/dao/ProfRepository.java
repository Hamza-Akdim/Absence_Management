package com.demospring.backend.dao;

import com.demospring.backend.entities.Prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProfRepository extends JpaRepository<Prof, Long> {
    @Query("select p.id from Prof p where p.firstname=:x and p.lastName=:y and p.course=:z")
    Long getId(@Param("x") String firstName, @Param("y") String lastName, @Param("z") String course);
}
