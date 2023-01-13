package com.crud.university.controller;

import com.crud.university.dto.TeachersDto;
import com.crud.university.model.Teachers;
import com.crud.university.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/addTeacher")
    public Teachers addTeacher(@RequestBody TeachersDto teachersDto){
        return teacherService.addTeacher(teachersDto);
    }
}
