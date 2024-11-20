package com.demospring.backend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Collection;


@Entity

public class Prof {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastName;
    private String course;
    @OneToMany(mappedBy = "prof")
    private Collection<Absence> absences;
    
    
	public Long getId() {
		return id;
	}
	public String getfirstname() {
		return firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCourse() {
		return course;
	}
	public Collection<Absence> getAbsences() {
		return absences;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setAbsences(Collection<Absence> absences) {
		this.absences = absences;
	}
    

}
