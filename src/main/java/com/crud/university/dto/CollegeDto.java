package com.crud.university.dto;

import com.crud.university.model.College;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link College} entity
 */
@AllArgsConstructor
@Getter
public class CollegeDto implements Serializable {
    private final Long id;
    private final String collegeName;
    private final String collegeCode;
    private final String collegeAddress;
    private  Long  universityId;
}