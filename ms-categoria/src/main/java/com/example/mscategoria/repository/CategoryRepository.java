package com.example.mscategoria.repository;

import com.example.mscategoria.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categoria, Integer> {

}
