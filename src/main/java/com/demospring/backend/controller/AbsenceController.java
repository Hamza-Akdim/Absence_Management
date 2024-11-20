package com.demospring.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.demospring.backend.entities.Absence;
import com.demospring.backend.service.AbsenceService;



@RestController
@RequestMapping("/api/absences")
public class AbsenceController {
    @Autowired
    private AbsenceService absenceService;
   

		    @GetMapping
		    public List<Absence> listAllAbsences() {
		        return absenceService.getAllAbsences();
		    }
//tester sur postman : POST http://localhost:8080/api/absences/mark?etudiantId=1&profId=2&motif=Absent+pour+maladie

		    @PostMapping("/mark")
		    public ResponseEntity<Absence> markAbsence(@RequestParam Long etudiantId, 
		                                               @RequestParam Long profId, 
		                                               @RequestParam String motif) {
		        Absence absence = absenceService.markAbsence(etudiantId, profId, motif);
		        return new ResponseEntity<>(absence, HttpStatus.CREATED);  // Retourne l'absence créée
		    }
		    
//PUT http://localhost:8080/api/absences/1		    
		    @PutMapping("/{id}")
		    public ResponseEntity<Absence> updateAbsence(@PathVariable Long id, @RequestBody Absence absenceDetails) {
		        // Appeler la méthode du service pour mettre à jour l'absence
		        Absence updatedAbsence = absenceService.updateAbsence(id, absenceDetails);
		        return ResponseEntity.ok(updatedAbsence);  // Retourner l'absence mise à jour
		    }
    

		    @DeleteMapping("/{id}")
		    public void deleteAbsence(@PathVariable Long id) {
		        absenceService.deleteAbsence(id);
		    }
}
