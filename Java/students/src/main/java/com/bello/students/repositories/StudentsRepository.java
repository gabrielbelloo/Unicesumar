package com.bello.students.repositories;

import com.bello.students.models.StudentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<StudentsModel, Long> {

}
