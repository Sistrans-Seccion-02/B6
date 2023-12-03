package com.example.demo.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repositorio.HotelRepository;





@Controller
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;


    @GetMapping("/reservas")
    public String obtenerTodasLasReservas(Model model){
        //model.addAttribute("hotel", new Hotel());
        model.addAttribute("hotel", hotelRepository.findAll());
        return "reservas";
    }

    @GetMapping("/")
    public String home(Model model){
        return "index";
    }
}
