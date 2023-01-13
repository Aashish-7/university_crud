package com.crud.university.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class University {

    @Id
    private Long id;

    private String universityType;

    private String universityName;

    private String universityCode;

    private String universityAddress;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
//    @JoinColumn(name = "college_id")
    private List<College> collegeList;
}
