package com.demospring.backend.service;

import java.util.List;

import com.demospring.backend.dto.EtudiantDto;

public interface EtudiantService {
	List<EtudiantDto> getAllStudents();

}