package com.demospring.backend.service;

import java.util.List;

import com.demospring.backend.entities.Absence;

public interface AbsenceService {
    List<Absence> getAllAbsences();
    
    Absence markAbsence(Long etudiantId, Long profId, String motif);
    
    Absence updateAbsence(Long id, Absence absenceDetails);
    
    void deleteAbsence(Long id);

}
