package com.example.demo.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection = "bebidas")
public class Bebida {
    @Id
    private String id;
    @Field("nombre")
    private String nombre;
    @Field("idTipoBebida")
    private String idTipoBebida; 
    @Field("gradoAlcohol")
    private double gradoAlcohol;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
