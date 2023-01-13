package com.crud.university.controller;

import com.crud.university.dto.CollegeDto;
import com.crud.university.model.College;
import com.crud.university.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {

    CollegeService collegeService;

    @Autowired
    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @PostMapping("/addCollege")
    public College addCollege(@RequestBody CollegeDto collegeDto){
        return collegeService.addCollege(collegeDto);
    }
}
