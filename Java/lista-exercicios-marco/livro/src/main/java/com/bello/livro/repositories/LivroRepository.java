package com.bello.livro.repositories;

import com.bello.livro.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{
}
