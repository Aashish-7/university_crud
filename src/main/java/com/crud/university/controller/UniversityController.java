package com.crud.university.controller;

import com.crud.university.dto.UniversityDto;
import com.crud.university.model.University;
import com.crud.university.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @PostMapping("/addUniversity")
    public University addUniversity(@RequestBody UniversityDto universityDto){
        return universityService.addUniversity(universityDto);
    }
}
