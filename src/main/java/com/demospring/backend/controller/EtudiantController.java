package com.demospring.backend.controller;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.backend.dto.EtudiantDto;
import com.demospring.backend.service.EtudiantService;

import lombok.AllArgsConstructor;



@Data @NoArgsConstructor @AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class EtudiantController {
	
 private EtudiantService etudiantService;
 
// @Autowired
// //constructor to delete
// public EtudiantController(EtudiantService etudiantService) {
//     this.etudiantService = etudiantService;
// }
 //list all students
 @GetMapping
 public ResponseEntity<List<EtudiantDto>> getAllStudents(){
	 List<EtudiantDto> students=etudiantService.getAllStudents();
	 return ResponseEntity.ok(students);
 }
}