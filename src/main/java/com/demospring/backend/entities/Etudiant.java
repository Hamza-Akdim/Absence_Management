package com.demospring.backend.entities;

import jakarta.persistence.Entity;
import java.util.Collection;

import jakarta.persistence.*;




@Entity

public class Etudiant {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String level;
    private String comment;
    @OneToMany(mappedBy = "etudiant")
    private Collection<Absence> absences;

    public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getLevel() {
		return level;
	}
	public String getComment() {
		return comment;
	}
	public Collection<Absence> getAbsences() {
		return absences;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setAbsences(Collection<Absence> absences) {
		this.absences = absences;
	}
	

	

}
