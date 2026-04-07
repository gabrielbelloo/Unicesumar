package com.bello.aluno.repositories;

import com.bello.aluno.models.AlunoModel;
import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
}
