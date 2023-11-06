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

import com.example.demo.modelo.TipoBebida;
import com.example.demo.repositorio.TipoBebidaRepository;

@RestController
@RequestMapping("/tipobebidas")
public class TipoBebidaController {

    @Autowired
    private TipoBebidaRepository tipoBebidaRepository;

    @PostMapping
    public ResponseEntity<TipoBebida> crearTipoBebida(@RequestBody TipoBebida tipoBebida) {
        TipoBebida nuevoTipoBebida = tipoBebidaRepository.save(tipoBebida);
        return new ResponseEntity<>(nuevoTipoBebida, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TipoBebida>> obtenerTodasLasTipoBebidas() {
        List<TipoBebida> tipoBebidas = tipoBebidaRepository.findAll();
        return new ResponseEntity<>(tipoBebidas, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TipoBebida> obtenerTipoBebidaPorId(@PathVariable String id) {
        Optional<TipoBebida> tipoBebida = tipoBebidaRepository.findById(id);
        if (tipoBebida.isPresent()) {
            return new ResponseEntity<>(tipoBebida.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoBebida> actualizarTipoBebida(@PathVariable String id, @RequestBody TipoBebida tipoBebida) {
        Optional<TipoBebida> tipoBebidaExistente = tipoBebidaRepository.findById(id);
        if (tipoBebidaExistente.isPresent()) {
            tipoBebida.setId(id); // Asegura que el ID sea el mismo que el proporcionado en la URL
            TipoBebida tipoBebidaActualizada = tipoBebidaRepository.save(tipoBebida);
            return new ResponseEntity<>(tipoBebidaActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TipoBebida> borrarTipoBebida(@PathVariable String id) {
        Optional<TipoBebida> tipoBebida = tipoBebidaRepository.findById(id);
        if (tipoBebida.isPresent()) {
            tipoBebidaRepository.deleteById(id);
            return new ResponseEntity<>(tipoBebida.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
