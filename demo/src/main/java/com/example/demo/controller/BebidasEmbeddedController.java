package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
}
