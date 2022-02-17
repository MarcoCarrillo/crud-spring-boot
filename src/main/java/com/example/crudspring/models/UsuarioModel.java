package com.example.crudspring.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;

    @JsonIgnore
    @OneToOne(fetch =FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_id")
    private DetalleUsuarioModel detalleUsuario;

    public DetalleUsuarioModel getDetalleUsuario() {
        return detalleUsuario;
    }

    public void setDetalleUsuario(DetalleUsuarioModel detalleUsuario) {
        this.detalleUsuario = detalleUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }



    @Override
    public String toString() {
        return "UsuarioModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", prioridad=" + prioridad +
                ", detalleUsuario=" + detalleUsuario +
                '}';
    }
}
