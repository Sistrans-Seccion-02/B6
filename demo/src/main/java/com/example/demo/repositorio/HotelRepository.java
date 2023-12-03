package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.modelo.Hotel;

public interface HotelRepository extends MongoRepository<Hotel, String>{

}
