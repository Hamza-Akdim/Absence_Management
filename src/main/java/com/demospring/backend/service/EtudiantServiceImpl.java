package com.demospring.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospring.backend.dao.EtudiantRepository;
import com.demospring.backend.entities.Etudiant;


@Service

public class EtudiantServiceImpl implements EtudiantService{
	@Autowired
    private EtudiantRepository etudiantRepository; 
// public EtudiantServiceImpl(EtudiantRepository etudiantRepository) {
//     this.etudiantRepository = etudiantRepository;
// }

@Override
public List<Etudiant> getAllStudents() {
	return etudiantRepository.findAll();
}
}