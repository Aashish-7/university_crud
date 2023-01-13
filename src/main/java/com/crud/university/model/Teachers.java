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
public class Teachers {

    @Id
    private Long id;

    private String teacherName;

    private String teacherAddress;

    private Long mobileNumber;

    @ManyToOne
    private College college;

//    @OneToMany
//    private List<Course> courseList;
}
