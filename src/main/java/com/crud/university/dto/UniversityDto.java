package com.crud.university.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link com.crud.university.model.University} entity
 */
@AllArgsConstructor
@Getter
public class UniversityDto implements Serializable {
    private final Long id;
    private final String universityType;
    private final String universityName;
    private final String universityCode;
    private final String universityAddress;
    private final List<Long> collegeId;
}