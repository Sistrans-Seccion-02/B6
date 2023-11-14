package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.BebidaTipos;

public interface BebidaTiposRepository extends MongoRepository<BebidaTipos, String>{
    
}
