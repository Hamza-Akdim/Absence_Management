package com.demospring.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospring.backend.dao.EtudiantRepository;
import com.demospring.backend.dto.EtudiantDto;
import com.demospring.backend.entities.Etudiant;
import com.demospring.backend.mapper.EtudiantMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class EtudiantServiceImpl implements EtudiantService{
 private EtudiantRepository etudiantRepository;
 //constructor to delete
// @Autowired
// public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
//     this.etudiantRepository = etudiantRepository;
// }

@Override
public List<EtudiantDto> getAllStudents() {
	//list of jpa entities
	List<Etudiant> etudiants =etudiantRepository.findAll();
	//so convert'em to EtudiantDto entities
	
	// Convertir la liste d'entités Etudiant en liste d'objets EtudiantDto
	return etudiants.stream()
	        .map(EtudiantMapper::mapToEtudiantDto)
	        .toList(); 

}
}