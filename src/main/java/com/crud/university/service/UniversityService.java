package com.crud.university.service;

import com.crud.university.dao.CollegeRepository;
import com.crud.university.dao.UniversityRepository;
import com.crud.university.dto.UniversityDto;
import com.crud.university.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    UniversityRepository universityRepository;

    CollegeRepository collegeRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository, CollegeRepository collegeRepository) {
        this.universityRepository = universityRepository;
        this.collegeRepository = collegeRepository;
    }

    public University addUniversity(UniversityDto universityDto){
        University university = new University();
        university.setId(universityDto.getId());
        university.setUniversityName(universityDto.getUniversityName());
        university.setUniversityType(universityDto.getUniversityType());
        university.setUniversityCode(universityDto.getUniversityCode());
        university.setUniversityAddress(universityDto.getUniversityAddress());
        university.setCollegeList(collegeRepository.findAllByIdIn(universityDto.getCollegeId()));
        universityRepository.save(university);
        return university;
    }
}
