package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Bebida;
import com.example.demo.repositorio.BebidaRepository;

@RestController
@RequestMapping("/bebidas")
public class BebidasController {

    @Autowired
    private BebidaRepository bebidaRepository;

    @PostMapping
    public ResponseEntity<Bebida> crearBebida(@RequestBody Bebida bebida) {
        // Lógica para crear una bebida y guardarla en la base de datos utilizando el repositorio
        Bebida nuevaBebida = bebidaRepository.save(bebida);
        
        // Devuelve una respuesta con el código de estado 201 (Created) y la bebida creada
        return new ResponseEntity<>(nuevaBebida, HttpStatus.CREATED);
    }
}


