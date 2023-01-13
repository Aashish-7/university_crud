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
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

    @Id
    private Long id;

    private String branchName;

    private String branchCode;

    @ManyToOne
    private Course course;

//    @OneToMany
//    private List<Subject> subjectList;
}
