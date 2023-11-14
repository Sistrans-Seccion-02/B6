package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        Bebida nuevaBebida = bebidaRepository.save(bebida);
        return new ResponseEntity<>(nuevaBebida, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Bebida>> obtenerTodasLasBebidas() {
        List<Bebida> bebidas = bebidaRepository.findAll();
        return new ResponseEntity<>(bebidas, HttpStatus.OK);
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Bebida> obtenerBebidaPorId(@PathVariable String id) {
        Optional<Bebida> bebida = bebidaRepository.findById(id);
        if (bebida.isPresent()) {
            return new ResponseEntity<>(bebida.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bebida> actualizarBebida(@PathVariable String id, @RequestBody Bebida bebida) {
        Optional<Bebida> bebidaExistente = bebidaRepository.findById(id);
        if (bebidaExistente.isPresent()) {
            //bebida.setId(id); // Asegura que el ID sea el mismo que el proporcionado en la URL
            Bebida bebidaActualizada = bebidaRepository.save(bebida);
            return new ResponseEntity<>(bebidaActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBebida(@PathVariable String id) {
        Optional<Bebida> bebidaExistente = bebidaRepository.findById(id);
        if (bebidaExistente.isPresent()) {
            bebidaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}


