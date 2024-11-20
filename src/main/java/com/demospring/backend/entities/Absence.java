package com.demospring.backend.entities;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.*;


@Entity
public class Absence {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String motif;
    private String heure;
    
    
	@ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Prof prof;
    
	public Long getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public String getMotif() {
		return motif;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public Prof getProf() {
		return prof;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public void setProf(Prof prof) {
		this.prof = prof;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
    

}
