package com.crud.university.service;

import com.crud.university.dao.TeachersRepository;
import com.crud.university.dto.TeachersDto;
import com.crud.university.model.Teachers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    TeachersRepository teachersRepository;

    @Autowired
    public TeacherService(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }

    public Teachers addTeacher(TeachersDto teachersDto){
        Teachers teachers = new Teachers();
        teachers.setId(teachersDto.getId());
        teachers.setTeacherName(teachersDto.getTeacherName());
        teachers.setTeacherAddress(teachersDto.getTeacherAddress());
        teachers.setMobileNumber(teachersDto.getMobileNumber());
        teachersRepository.save(teachers);
        return teachers;
    }
}
