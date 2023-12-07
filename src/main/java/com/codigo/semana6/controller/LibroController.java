package com.codigo.semana6.controller;

import com.codigo.semana6.service.LibroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;
    public LibroController(LibroService libroService){
        this.libroService = libroService;
    }

}
