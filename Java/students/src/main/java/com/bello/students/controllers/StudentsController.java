package com.bello.students.controllers;

import com.bello.students.models.StudentsModel;
import com.bello.students.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<StudentsModel> findAll(){
        return studentsService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<StudentsModel> findById(@PathVariable Long id){
        return studentsService.findById(id);
    }

    @PostMapping
    public StudentsModel create(@RequestBody StudentsModel studentsModel){
        return studentsService.create(studentsModel);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        studentsService.delete(id);
    }
}
