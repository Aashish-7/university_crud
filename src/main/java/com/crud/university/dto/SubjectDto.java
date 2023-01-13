package com.crud.university.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * A DTO for the {@link com.crud.university.model.Subject} entity
 */
@AllArgsConstructor
@Getter
public class SubjectDto implements Serializable {
    private final Long id;
    private final String subjectName;
    private final String subjectCode;
}