package com.example.demo.modelo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Bebida {
    @Id
    private String id;
    @Field("nombre")
    private String nombre;
    @Field("idTipoBebida")
    private String idTipoBebida; 
    @Field("gradoAlcohol")
    private double gradoAlcohol;

    
}
