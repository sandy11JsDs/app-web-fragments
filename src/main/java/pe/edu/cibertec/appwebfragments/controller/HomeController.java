package pe.edu.cibertec.appwebfragments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("index")
    public String home(){
        return "home";
    }
}
