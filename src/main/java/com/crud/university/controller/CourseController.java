package com.crud.university.controller;

import com.crud.university.dto.CourseDto;
import com.crud.university.model.Course;
import com.crud.university.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody CourseDto courseDto){
        return courseService.addCourse(courseDto);
    }
}
