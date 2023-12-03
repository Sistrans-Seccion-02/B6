package com.example.demo.repositorio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.modelo.clientes; 
import com.example.demo.modelo.habitaciones;
import com.example.demo.modelo.reservas;
import com.example.demo.modelo.servicio;
import com.example.demo.modelo.tipohabi;

import java.util.List;

public interface reservaRepository extends MongoRepository<reservas, ObjectId> {

    @Query("{}")
    List<reservas> findAllReservas();


    @Aggregation(pipeline = {"{ $group: {_id: \"$habitaciones.tipohabi.nombre\", habitaciones: { $first: \"$habitaciones.tipohabi\" }}},{$replaceWith: { $arrayElemAt: [\"$habitaciones\", 0] }}"})
    List<tipohabi> getTipohabis();

    @Aggregation(pipeline = {"{$group: {_id: \"$habitaciones.numero\", habitaciones: {$first: \"$habitaciones\" } }}, {$replaceWith: { $arrayElemAt: [\"$habitaciones\", 0] } }"})
    List<habitaciones> getHabis();
    
    
}