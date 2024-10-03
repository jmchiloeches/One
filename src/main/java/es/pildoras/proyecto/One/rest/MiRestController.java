package es.pildoras.proyecto.One.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MiRestController {

    @GetMapping("/")
    public String saludo(){
//        return "Hola alumnos de Spring Boot";
        return "index";
    }
}
