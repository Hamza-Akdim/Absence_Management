package com.demospring.backend.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.Collection;


@Setter
@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String level;
    private String comment;
    @OneToMany(mappedBy = "etudiant")
    private Collection<Absence> absences;



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
