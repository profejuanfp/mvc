package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mostrarDatosController {
    
    /*1*/
    @GetMapping ("/mostrar-datos")
    public String mostrarDatos (){
        return "mostrar-datos";
    }
}
