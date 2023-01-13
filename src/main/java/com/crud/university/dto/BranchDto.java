package com.crud.university.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.crud.university.model.Branch} entity
 */
@AllArgsConstructor
@Getter
public class BranchDto implements Serializable {
    private final Long id;
    private final String branchName;
    private final String branchCode;
    private final CourseDto course;
}