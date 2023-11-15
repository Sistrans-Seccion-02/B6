package com.example.demo.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "bebidas_embedded")
public class BebidaEmbedded {
    @Id
    private String id;
    private String nombre;
    private double gradoAlcohol;

    public BebidaEmbedded(){}

    public BebidaEmbedded(String nombre, double grado){

        this.nombre = nombre;
        this.gradoAlcohol = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }
}
