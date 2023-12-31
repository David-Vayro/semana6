package com.codigo.semana6.controller;

import com.codigo.semana6.entity.AutorEntity;
import com.codigo.semana6.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;
    @GetMapping
    public List<AutorEntity> listaAutores(){
        List<AutorEntity> autores = autorService.obtenerTodos();
        return autores;
    }
    @GetMapping("/{id}")
    public ResponseEntity<AutorEntity> obtenerAutorPorID(@PathVariable Long id) throws Exception{
    AutorEntity autor = autorService.obtenerAutorPorId(id);
    return ResponseEntity.ok(autor);
    }
    public ResponseEntity<AutorEntity> crearAutor (@RequestBody AutorEntity autor){
        AutorEntity nuevoAutor = autorService.crearAutor(autor);
        return new ResponseEntity<>(nuevoAutor, HttpStatus.BAD_REQUEST);
    }

}
