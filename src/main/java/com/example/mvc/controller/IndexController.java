package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvc.model.Usuario;

@Controller /*anotacion*/
public class IndexController {
    
    /*index no necesita un metodo @GetMapping*/

    @GetMapping ("/")
    public String index (Model model){
        Usuario usuario = new Usuario();
        usuario.setApellido("de los palotes");
        usuario.setNombre("rogelio");
        model.addAttribute("usuario", usuario);
        return "index";
    }

    /*@PostMapping ()*/
}
