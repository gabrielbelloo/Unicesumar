package com.bello.students.services;

import com.bello.students.models.StudentsModel;
import com.bello.students.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    StudentsRepository studentsRepository;

    public List<StudentsModel> findAll() {
        return studentsRepository.findAll();
    }

    public StudentsModel create(StudentsModel studentModel) {
        return studentsRepository.save(studentModel);
    }
}