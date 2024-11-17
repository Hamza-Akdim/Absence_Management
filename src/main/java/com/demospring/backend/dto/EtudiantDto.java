package com.demospring.backend.dto;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
	
//to transform data between client and server
@Getter
@Setter	
@AllArgsConstructor 
public class EtudiantDto {

	    private Long id;
	    private String firstName;
	    private String lastName;
	    private String level;
	    private String comment;
	    
	    
	    
//	 public Long getId() {
//			return id;
//		}
//
//
//
//		public String getFirstName() {
//			return firstName;
//		}
//
//
//
//		public String getLastName() {
//			return lastName;
//		}
//
//
//
//		public String getLevel() {
//			return level;
//		}
//
//
//
//		public String getComment() {
//			return comment;
//		}






		// Constructeur avec tous les arguments
//	    public EtudiantDto(Long id, String firstName, String lastName, String level, String comment) {
//	        this.id = id;
//	        this.firstName = firstName;
//	        this.lastName = lastName;
//	        this.level = level;
//	        this.comment = comment;
//	    }


}
