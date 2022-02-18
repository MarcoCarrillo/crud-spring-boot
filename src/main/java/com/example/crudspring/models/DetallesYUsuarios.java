package com.example.crudspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class DetallesYUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;
    private String idioma;
    private String pais;
    private boolean activo;

//    @JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "detalle_id")
    private DetalleUsuarioModel detalleUsuario;

//    @JsonIgnore
//    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "detalleUsuario")
    private UsuarioModel usuarioModel;
}
