package com.example.demo.controller;

import java.util.Collections;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.modelo.BebidaEmbedded;
import com.example.demo.modelo.BebidaTipos;
import com.example.demo.repositorio.BebidaEmbeddedRepository;
import com.example.demo.repositorio.BebidaTiposRepository;

@Controller
public class BebidaTiposController {

    @Autowired
    private BebidaTiposRepository btRepository;

    @Autowired
    private BebidaEmbeddedRepository beRepository;

    @GetMapping("/bt")
    public String obtenerTodasLasBebidasTipos(Model model){
        model.addAttribute("bts", btRepository.findAll());
        return "bebidaTipos";
    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }

    @GetMapping("/btForm")
    public String mostrarFormulario(Model model) {
        // Creamos una instancia vacía para el nuevo BebidaTipos
        model.addAttribute("nuevoBebidaTipo", new BebidaTipos());
        return "bebidaTiposForm";
    }

    @PostMapping("/crearBebidaTipo")
    public String crearBebidaTipos(@ModelAttribute("nuevoBebidaTipo") BebidaTipos nuevoBebidaTipo) {

        // Creamos una nueva bebida utilizando los datos del formulario
        BebidaEmbedded nuevaBebida = new BebidaEmbedded(
            nuevoBebidaTipo.getBebidas().get(0).getNombre(),
            nuevoBebidaTipo.getBebidas().get(0).getGradoAlcohol()
        );

        // Agregamos la bebida a la lista de bebidas en el nuevo tipo de bebida
        nuevoBebidaTipo.setBebidas(Collections.singletonList(nuevaBebida));
        
        // Guardamos la bebida embebida
        beRepository.save(nuevaBebida);

        // Guardamos el nuevo tipo de bebida
        btRepository.save(nuevoBebidaTipo);
        return "redirect:/bt";
    }

    
}
