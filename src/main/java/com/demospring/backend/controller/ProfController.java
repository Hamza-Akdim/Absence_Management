package com.demospring.backend.controller;

import com.demospring.backend.dao.ProfRepository;
import com.demospring.backend.entities.Prof;
import com.demospring.backend.requests.ProfRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/prof")
public class ProfController {

    @Autowired
    private ProfRepository profRepository;

    @GetMapping("/auth")
    public Long getIdProf(@RequestBody ProfRequest profRequest){

        Long idProf = profRepository.getId(profRequest.getFirstName(), profRequest.getLastName(), profRequest.getCourse());
        if (idProf!=null)
            return idProf;

        return null;
    }
}
