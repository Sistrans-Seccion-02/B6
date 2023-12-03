package com.example.demo.modelo;

public class tipoHabiEmbedded {
    private String nombre;
    private Integer costo;
    private Integer capacidad;
    
    public tipoHabiEmbedded() {
        super();
    }

    public tipoHabiEmbedded(String nombre, Integer costo, Integer capacidad) {
        super();
        this.nombre = nombre;
        this.costo = costo;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    
}
