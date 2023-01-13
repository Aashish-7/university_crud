package com.crud.university.service;

import com.crud.university.dao.CourseRepository;
import com.crud.university.dto.CourseDto;
import com.crud.university.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course addCourse(CourseDto courseDto){
        Course course = new Course();
        course.setId(courseDto.getId());
        course.setCourseName(courseDto.getCourseName());
        course.setCourseCode(courseDto.getCourseCode());
        course.setCourseDuration(courseDto.getCourseDuration());
        courseRepository.save(course);
        return course;
    }
}
