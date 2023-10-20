package br.com.zeroes.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    // @RequestMapping(path = "/", method = RequestMethod.GET)
    
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public String mensagem(ModelMap modelMap) {
        
        modelMap.addAttribute("mensagem", "Mensagem de boas vindas do servidor");
        
        return "mensagem";

        // model.addAttribute("mensagem", "Mensagem vinda do servidor!");
        // return "mensagem";
    }

}
