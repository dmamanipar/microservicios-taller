package com.example.mscatalog.controller;

import com.example.mscatalog.entity.Categoria;
import com.example.mscatalog.service.CategoryServiceI;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoryController {
    @Autowired
    private CategoryServiceI categoriaService;
    @GetMapping()
    public ResponseEntity<List<Categoria>> list() {
        return ResponseEntity.ok().body(categoriaService.listar());
    }
    @PostMapping()
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {return
            ResponseEntity.ok(categoriaService.guardar(categoria));
    }
    @PutMapping()
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria) {return
            ResponseEntity.ok(categoriaService.actualizar(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> listById(@PathVariable(required = true) Integer id) {return
            ResponseEntity.ok().body(categoriaService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {categoriaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
