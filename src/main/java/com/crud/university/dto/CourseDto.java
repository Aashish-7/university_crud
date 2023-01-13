package com.crud.university.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.crud.university.model.Course} entity
 */
@AllArgsConstructor
@Getter
public class CourseDto implements Serializable {
    private final Long id;
    private final String courseName;
    private final String courseDuration;
    private final String courseCode;
}