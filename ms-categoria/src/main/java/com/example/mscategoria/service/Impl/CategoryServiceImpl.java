package com.example.mscategoria.service.Impl;

import com.example.mscategoria.entity.Categoria;
import com.example.mscategoria.repository.CategoryRepository;
import com.example.mscategoria.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Categoria> listar() {
        return categoryRepository.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> listarPorId(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        categoryRepository.deleteById(id);
    }
}
