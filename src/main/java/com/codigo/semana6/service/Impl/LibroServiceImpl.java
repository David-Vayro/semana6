package com.codigo.semana6.service.Impl;

import com.codigo.semana6.dao.LibroDAO;
import com.codigo.semana6.entity.LibroEntity;
import com.codigo.semana6.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LibroServiceImpl  implements LibroService {
    @Autowired
    private LibroDAO libroDAO;
    @Override
    public List<LibroEntity> obtenertodos() {
        return libroDAO.findAll();
    }

    @Override
    public LibroEntity obtenerLibroPorId(Long id) throws Exception {
        Optional<LibroEntity> libro = libroDAO.findById(id);
        if(libro.isPresent()){
            return libro.get();
        }
        return null;
    }

    @Override
    public LibroEntity crearLibro(LibroEntity libro) {
        return null;
    }
}
