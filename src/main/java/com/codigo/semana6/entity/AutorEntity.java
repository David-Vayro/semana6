package com.codigo.semana6.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity   //indica a JPA que es una entidad
@Getter
@Setter
@Table(name="autor")

public class AutorEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer estado;

}
