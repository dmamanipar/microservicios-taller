package com.example.mscatalog.service;

import com.example.mscatalog.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoryServiceI {
    public List<Categoria> listar();
    public Categoria guardar(Categoria categoria);
    public Categoria actualizar(Categoria categoria);
    public Optional<Categoria> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
