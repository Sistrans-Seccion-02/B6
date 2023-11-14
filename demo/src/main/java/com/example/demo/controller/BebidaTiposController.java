package com.example.demo.controller;

import java.util.Collections;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.modelo.Bebida;
import com.example.demo.modelo.BebidaTipos;
import com.example.demo.repositorio.BebidaTiposRepository;

@Controller
public class BebidaTiposController {

    @Autowired
    private BebidaTiposRepository btRepository;

    @GetMapping("/bt")
    public String obtenerTodasLasBebidasTipos(Model model){
        model.addAttribute("bts", btRepository.findAll());
        return "bebidaTipos";
    }

    @GetMapping("/btForm")
    public String mostrarFormulario(Model model) {
        // Crea una instancia vacía para el nuevo BebidaTipos
        model.addAttribute("nuevoBebidaTipo", new BebidaTipos());
        return "bebidaTiposForm";
    }

    @PostMapping("/crearBebidaTipo")
    public String crearBebidaTipos(@ModelAttribute("nuevoBebidaTipo") BebidaTipos nuevoBebidaTipo) {

        // Crea una nueva bebida utilizando los datos del formulario
        Bebida nuevaBebida = new Bebida(
            nuevoBebidaTipo.getBebidas().get(0).getNombre(),
            nuevoBebidaTipo.getBebidas().get(0).getIdTipoBebida(),
            nuevoBebidaTipo.getBebidas().get(0).getGradoAlcohol()
        );

        // Agrega la bebida a la lista de bebidas en el nuevo tipo de bebida
        nuevoBebidaTipo.setBebidas(Collections.singletonList(nuevaBebida));

        // Guarda el nuevo tipo de bebida
        btRepository.save(nuevoBebidaTipo);
        return "redirect:/bt";
    }

    
}
