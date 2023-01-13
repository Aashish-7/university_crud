package com.crud.university.model;

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
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private Long id;

    private String courseName;

    private String courseDuration;

    private String courseCode;

    @ManyToOne
    private Teachers teachers;

//    @OneToMany
//    private List<Branch> branchList;
}
