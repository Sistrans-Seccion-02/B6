package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.BebidaEmbedded;

public interface BebidaEmbeddedRepository extends MongoRepository<BebidaEmbedded, String>{
    
}
