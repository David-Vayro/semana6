package com.codigo.semana6.service.Impl;

import com.codigo.semana6.dao.AutorDAO;
import com.codigo.semana6.entity.AutorEntity;
import com.codigo.semana6.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements AutorService {
@Autowired
private AutorDAO autorDAO;
    @Override
    public List<AutorEntity> obtenerTodos() {
        return autorDAO.findAll();
    }

    @Override
    public AutorEntity obtenerAutorPorId(Long id)throws Exception {
            Optional<AutorEntity> autor=autorDAO.findById(id);
        if (autor.isPresent()){
            return autor.get();
        }
        return null;
    }

    @Override
    public AutorEntity crearAutor(AutorEntity autor) {
        return null;
    }

    @Override
    public AutorEntity actualizarAutor(Long id, AutorEntity autor) {
        return null;
    }

    @Override
    public AutorEntity eliminarAutor(Long id) {
        return null;
    }
}
