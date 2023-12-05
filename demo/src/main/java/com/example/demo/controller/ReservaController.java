package com.example.demo.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repositorio.reservaRepository;


@Controller
public class ReservaController {

    @Autowired
    private reservaRepository reservasRepository;

    @GetMapping("/reservas")
    public String obtenerTodasLasReservas(Model model) {
        model.addAttribute("reservas", reservasRepository.findAllReservas());
        return "reservas";
    }

    @GetMapping("/tiposhabitaciones")
    public String obtenerTodasLosTiposHabis(Model model) {
        model.addAttribute("tiposhabitaciones", reservasRepository.getTipohabis());
        return "tiposhabitaciones";
    }

    @GetMapping("/habitaciones")
    public String obtenerTodasLasHabis(Model model) {
        model.addAttribute("habitaciones", reservasRepository.getHabis());
        return "habitaciones";
    }

    @GetMapping("/servicios")
    public String obtenerTodosLosServicios(Model model) {
        model.addAttribute("servicios", reservasRepository.obtenerInformacionServicios());
        return "servicios";
    }

    @GetMapping("/consumos")
    public String obtenerTodosLosConsumos(Model model) {
        model.addAttribute("consumos", reservasRepository.obtenerConsumos());
        return "consumos";
    }

    @GetMapping("/RFC1")
    public String obtenerRFC1(Model model) {
        model.addAttribute("RFC1", reservasRepository.obtenerRFC1());
        return "RFC1";
    }

    @GetMapping("/RFC2")
    public String obtenerRFC2(Model model) {
        model.addAttribute("RFC2", reservasRepository.obtenerRFC2());
        return "RFC2";
    }

    @GetMapping("/RFC3")
    public String obtenerRFC3(Model model,@RequestParam(name = "id", required = false, defaultValue = "Juan Perez") String id,
                                            @RequestParam(name = "fechaI", required = false, defaultValue = "2023-12-10") String fechaI,
                                            @RequestParam(name = "fechaF", required = false, defaultValue = "2023-12-18") String fechaF) {
        SimpleDateFormat original = new SimpleDateFormat("yyyy-MM-dd");

        if ((id == null || id.equals("")) || (fechaI ==null || fechaI.equals(""))  || (fechaF ==null || fechaF.equals("")) ){
            model.addAttribute("RFC3", reservasRepository.obtenerConsumos());
        }else{

        try {
            Date fechaDateI = original.parse(fechaI);
            Date fechaDateF = original.parse(fechaF);
            model.addAttribute("RFC3", reservasRepository.obtenerRFC3(id, fechaDateI, fechaDateF));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
        return "RFC3";
    }

    /*
    @GetMapping("/RFC4")
    public String obtenerRFC4(Model model,@RequestParam(name = "servicio", required = false, defaultValue = "Restaurante") String servicio,
                                            @RequestParam(name = "fechaI", required = false, defaultValue = "2023-12-10") String fechaI,
                                            @RequestParam(name = "fechaF", required = false, defaultValue = "2023-12-18") String fechaF) {
        model.addAttribute("RFC4", reservasRepository.obtenerRFC4(servicio, fechaI, fechaF));
        return "RFC4";
    } */

    @GetMapping("/RFC4")
    public String obtenerRFC4(Model model) {
        model.addAttribute("RFC4", reservasRepository.obtenerRFC4());
        return "RFC4";
    }
}
