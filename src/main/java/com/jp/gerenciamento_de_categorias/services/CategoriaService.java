package com.jp.gerenciamento_de_categorias.services;

import com.jp.gerenciamento_de_categorias.models.CategoriaModel;
import com.jp.gerenciamento_de_categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaModel> findAll(){
        return categoriaRepository.findAll();
    }

    public CategoriaModel findById(Long id) {
        return categoriaRepository.findById(id).get();
    }

    public void deletarById(Long id){
        categoriaRepository.deleteById(id);
    }
    public CategoriaModel save(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }
}
