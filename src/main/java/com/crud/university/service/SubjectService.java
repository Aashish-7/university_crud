package com.crud.university.service;

import com.crud.university.dao.SubjectRepository;
import com.crud.university.dto.SubjectDto;
import com.crud.university.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    SubjectRepository subjectRepository;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public Subject addSubject(SubjectDto subjectDto) {
        Subject subject = new Subject(subjectDto.getId(), subjectDto.getSubjectName(), subjectDto.getSubjectCode());
        return subjectRepository.save(subject);
    }
}
