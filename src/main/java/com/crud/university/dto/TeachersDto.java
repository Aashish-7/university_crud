package com.crud.university.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.crud.university.model.Teachers} entity
 */
@AllArgsConstructor
@Getter
public class TeachersDto implements Serializable {
    private final Long id;
    private final String teacherName;
    private final String teacherAddress;
    private final Long mobileNumber;
}