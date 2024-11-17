package com.demospring.backend.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;


@Setter
@Getter
@Entity
@Data
@AllArgsConstructor 
public class Etudiant {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String level;
    private String comment;
//	public Long getId() {
//		return id;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public String getLevel() {
//		return level;
//	}
//	public String getComment() {
//		return comment;
//	}
//	
//    public Etudiant(Long id, String firstName, String lastName, String level, String comment) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.level = level;
//        this.comment = comment;
//    }
//    public Etudiant() {
//        
//    }
	

}
