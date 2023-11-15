package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.modelo.BebidaEmbedded;
import com.example.demo.repositorio.BebidaEmbeddedRepository;

@Controller
public class BebidasEmbeddedController {

    @Autowired
    BebidaEmbeddedRepository beRepository;

    @GetMapping("/be")
    public String obtenerTodasLasBebidasTipos(Model model){
        model.addAttribute("bts", beRepository.findAll());
        return "bebidasEmbedded";
    }

    @GetMapping("/beForm")
    public String mostrarFormulario(Model model) {
        // Creamos una instancia vacía para el nuevo BebidaTipos
        model.addAttribute("nuevoBebidaEm", new BebidaEmbedded());
        return "bebidaEmbeddedForm";
    }

    @PostMapping("/crearBebidaEmTipo")
    public String crearBebidaTipos(@ModelAttribute("nuevoBebidaEm") BebidaEmbedded nuevoBebidaEm) {

        // Creamos una nueva bebida utilizando los datos del formulario
        BebidaEmbedded nuevaBebida = new BebidaEmbedded(
            nuevoBebidaEm.getNombre(),
            nuevoBebidaEm.getGradoAlcohol()
        );

        // Guardamos la bebida embebida
        beRepository.save(nuevaBebida);
        return "redirect:/be";
    }
    
}
