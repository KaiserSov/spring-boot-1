package com.sofka.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridades;
    private String telefono;

    public void setPrioridades(Integer prioridades) {
        this.prioridades = prioridades;
    }

    public Integer getPrioridades() {
        return prioridades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(nullable=false, length = 50, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.nombre = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}
