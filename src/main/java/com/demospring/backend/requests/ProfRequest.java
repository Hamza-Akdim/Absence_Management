package com.demospring.backend.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ProfRequest {
    private String firstName;
    private String lastName;
    private String course;


}
