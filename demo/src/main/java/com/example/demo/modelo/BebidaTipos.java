package com.example.demo.modelo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "bebidas_tipos")
public class BebidaTipos {

    @Id
    private String id;

    // Name of Tipo Bebida
    private String nombre;

    // Embedded bebidas documents
    private List<Bebida> Bebidas;

    public BebidaTipos(){
        //Empty constructor for Spring
    }

    public BebidaTipos(String nombre, List<Bebida> bebidas) {
        //Constructor with attributes, note that id is being mapped automatically by mongo if not especified
        this.nombre = nombre;
        this.Bebidas = bebidas;
    }
    
    //<---------- Getters and Setters ---------->
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String name){
        this.nombre = name;
    }   

    public List<Bebida> getBebidas(){
        return Bebidas;
    }

    public void setBebidas(List<Bebida> bebidas){
        this.Bebidas = bebidas;
    }




    
    
}
