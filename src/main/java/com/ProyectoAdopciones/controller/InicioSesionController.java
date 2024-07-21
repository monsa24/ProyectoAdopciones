package com.ProyectoAdopciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j

public class InicioSesionController {

    @GetMapping("/iniciarSesion")
    public String mostrar() {
        return "/iniciarSesion/iniciarSesion"; // Retorna la vista inicioSesion.html
    }
}
