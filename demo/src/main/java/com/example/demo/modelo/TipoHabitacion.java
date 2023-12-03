package com.example.demo.modelo;

import java.util.List;

public class TipoHabitacion {

    private String nombre;
    private int costo;
    private int capacidad;

    public TipoHabitacion(String nombre, int costo, int capacidad) {
        super();
        this.nombre = nombre;
        this.costo = costo;
        this.capacidad = capacidad;
    }

    public TipoHabitacion() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    
    
}
