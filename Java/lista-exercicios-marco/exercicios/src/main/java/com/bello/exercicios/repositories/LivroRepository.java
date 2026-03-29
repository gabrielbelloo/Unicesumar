package com.bello.exercicios.repositories;

import com.bello.exercicios.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{
}
