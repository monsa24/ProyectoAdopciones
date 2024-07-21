package com.ProyectoAdopciones.controller;


import com.ProyectoAdopciones.domain.Gatito;
import com.ProyectoAdopciones.service.GatitoService;
//import com.tienda.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequestMapping("/gatito")

public class GatitoController {

    @Autowired
    private GatitoService gatitoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var gatitos = gatitoService.getGatitos(false);
        model.addAttribute("gatitos", gatitos);
        model.addAttribute("totalGatitos", gatitos.size());
        //crear URL local host
        return "/gatito/listado";
        //finalizando el controlador para la lista
    }

    @GetMapping("/nuevo")
    public String categoriaNuevo(Gatito gatito) {
        return "/gatito/modifica";
    }

//    @Autowired
//    private FirebaseStorageServiceImpl firebaseStorageService;

 

 
}
