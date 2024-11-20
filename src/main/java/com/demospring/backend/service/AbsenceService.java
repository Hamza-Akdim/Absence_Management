package com.demospring.backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospring.backend.dao.AbsenceRepository;
import com.demospring.backend.dao.EtudiantRepository;
import com.demospring.backend.dao.ProfRepository;
import com.demospring.backend.entities.Absence;
import com.demospring.backend.entities.Etudiant;
import com.demospring.backend.entities.Prof;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AbsenceService {

    @Autowired
    private AbsenceRepository absenceRepository;

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private ProfRepository profRepository;
    
  //=================================listage=========================
    
    public List<Absence> getAllAbsences() {
        return absenceRepository.findAll();      }
    
  //=================================mark absence=========================

 // Méthode pour marquer une absence
    public Absence markAbsence(Long etudiantId, Long profId, String motif) {
        // Récupérer l'étudiant par son ID
        Etudiant etudiant = etudiantRepository.findById(etudiantId)
                .orElseThrow(() -> new RuntimeException("Étudiant non trouvé avec l'id : " + etudiantId));

        // Optionnellement, récupérer un professeur par son ID
        Prof prof = profRepository.findById(profId)
                .orElseThrow(() -> new RuntimeException("Professeur non trouvé avec l'id : " + profId));

        // Créer une nouvelle absence
        Absence absence = new Absence();
        absence.setDate(new Date()); // Date actuelle
        absence.setMotif(motif);

        // Récupérer l'heure actuelle
        String heure = new SimpleDateFormat("HH:mm").format(new Date());
        absence.setHeure(heure);

        // Assigner l'étudiant et le professeur à l'absence
        absence.setEtudiant(etudiant);
        absence.setProf(prof);

        // Sauvegarder l'absence dans la base de données
        return absenceRepository.save(absence);
    }
//=================================UPDATE=========================
    
    public Absence updateAbsence(Long id, Absence absenceDetails) {
        // Récupérer l'absence existante par son ID
        Absence existingAbsence = absenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Absence non trouvée avec l'id : " + id));

        // Mettre à jour les champs de l'absence
        existingAbsence.setDate(absenceDetails.getDate());   
        existingAbsence.setHeure(absenceDetails.getHeure()); 
        existingAbsence.setMotif(absenceDetails.getMotif()); 

        // Sauvegarder l'absence mise à jour
        return absenceRepository.save(existingAbsence);
    }

    
  //=================================suppression=========================
    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);  
    }
}
