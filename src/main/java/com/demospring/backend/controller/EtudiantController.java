package com.demospring.backend.controller;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.backend.entities.Etudiant;
import com.demospring.backend.service.EtudiantService;


@RestController
@RequestMapping("/api/students")
public class EtudiantController {
	@Autowired
 private EtudiantService etudiantService;
 

//public EtudiantController(EtudiantService etudiantService) {
//   this.etudiantService = etudiantService;
//}

 //list all students
 @GetMapping
 public List<Etudiant> getAllEtudiants() {
     return etudiantService.getAllStudents();
 }
 
}