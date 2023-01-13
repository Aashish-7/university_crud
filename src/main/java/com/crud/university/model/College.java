package com.crud.university.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class College {

    @Id
    private Long id;

    private String collegeName;

    private String collegeCode;

    private String collegeAddress;

    @ManyToOne
    @JsonIgnore
    private University university;

//    @OneToMany
//    private List<Teachers> teachersList;
}
