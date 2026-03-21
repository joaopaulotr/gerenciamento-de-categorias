package com.jp.gerenciamento_de_categorias.controllers;

import com.jp.gerenciamento_de_categorias.models.CategoriaModel;
import com.jp.gerenciamento_de_categorias.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController {


    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public CategoriaModel save(CategoriaModel categoriaModel){
        return categoriaService.save(categoriaModel);
    }

    @GetMapping
    public List<CategoriaModel> listarCategorias(){
        return categoriaService.findAll();
    }

    @GetMapping
    public CategoriaModel buscarPorId(Long id){
        return categoriaService.findById(id);
    }
    @DeleteMapping
    public void removerCategoria(Long id){
        categoriaService.deletarById(id);
    }
}
