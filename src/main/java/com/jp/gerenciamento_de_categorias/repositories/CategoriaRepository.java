package com.jp.gerenciamento_de_categorias.repositories;

import com.jp.gerenciamento_de_categorias.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}
