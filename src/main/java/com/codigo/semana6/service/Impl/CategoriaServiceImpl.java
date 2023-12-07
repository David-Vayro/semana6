package com.codigo.semana6.service.Impl;

import com.codigo.semana6.dao.CategoriaDAO;
import com.codigo.semana6.entity.CategoriaEntity;
import com.codigo.semana6.entity.EditorEntity;
import com.codigo.semana6.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
private CategoriaDAO categoriaDAO;

    @Override
    public List<CategoriaEntity> obtenerTodos() {
        return categoriaDAO.findAll();
    }

    @Override
    public CategoriaEntity obtenerCategoriaPorId(Long id) throws Exception {
        Optional<CategoriaEntity> categoria = categoriaDAO.findById(id);
        if (categoria.isPresent()){
            return categoria.get();
        }
        return null;
    }

    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity categoria) {
        return null;
    }
}
