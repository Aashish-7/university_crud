package com.crud.university.service;

import com.crud.university.dao.CollegeRepository;
import com.crud.university.dao.UniversityRepository;
import com.crud.university.dto.CollegeDto;
import com.crud.university.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeService {

    CollegeRepository collegeRepository;

    UniversityRepository universityRepository;

    @Autowired
    public CollegeService(CollegeRepository collegeRepository, UniversityRepository universityRepository) {
        this.collegeRepository = collegeRepository;
        this.universityRepository = universityRepository;
    }


    public College addCollege(CollegeDto collegeDto){
        College college = new College();
        college.setId(collegeDto.getId());
        college.setCollegeName(collegeDto.getCollegeName());
        college.setCollegeCode(collegeDto.getCollegeCode());
        college.setCollegeAddress(collegeDto.getCollegeAddress());
        college.setUniversity(universityRepository.findById(collegeDto.getUniversityId()).get());
        collegeRepository.save(college);
        return college;
    }
}
