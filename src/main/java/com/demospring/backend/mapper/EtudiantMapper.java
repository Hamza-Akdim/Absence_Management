package com.demospring.backend.mapper;

import com.demospring.backend.dto.EtudiantDto;
import com.demospring.backend.entities.Etudiant;

public class EtudiantMapper {

    // Mapper un Etudiant (entité) vers un EtudiantDto
    public static EtudiantDto mapToEtudiantDto(Etudiant etudiant) {
        return new EtudiantDto(
                etudiant.getId(),
                etudiant.getFirstName(),
                etudiant.getLastName(),
                etudiant.getLevel(),
                etudiant.getComment()
        );
    }

    // Mapper un EtudiantDto vers un Etudiant (entité)
    public static Etudiant mapToEtudiantEntity(EtudiantDto etudiantDto) { 
        return new Etudiant(
                etudiantDto.getId(),
                etudiantDto.getFirstName(),
                etudiantDto.getLastName(),
                etudiantDto.getLevel(),
                etudiantDto.getComment()
        );
    }
}