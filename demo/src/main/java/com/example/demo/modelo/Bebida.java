package com.example.demo.modelo;


public class Bebida {
    private String nombre;
    private String idTipoBebida; 
    private double gradoAlcohol;

    public Bebida(){}

    public Bebida(String nombre, String id, double grado){

        this.nombre = nombre;
        this.idTipoBebida = id;
        this.gradoAlcohol = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdTipoBebida() {
        return idTipoBebida;
    }

    public void setIdTipoBebida(String idTipoBebida) {
        this.idTipoBebida = idTipoBebida;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }
}
