package com.example.demo.repositorio;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Reserva;
import com.example.demo.modelo.Servicio;
import com.example.demo.modelo.TipoHabitacion;

import java.util.List;

public interface ReservaRepository extends MongoRepository<Reserva, ObjectId> {

    @Query("{}")
    List<Reserva> findAllReservas();

    
}