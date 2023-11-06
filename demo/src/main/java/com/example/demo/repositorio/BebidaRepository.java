package com.example.demo.repositorio;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.modelo.Bebida;

public interface BebidaRepository extends MongoRepository<Bebida, String> {
    
}
