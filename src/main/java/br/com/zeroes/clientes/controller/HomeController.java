package br.com.zeroes.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    
    // @RequestMapping(path = "/", method = RequestMethod.GET)
    
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem() {       
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "Mensagem vinda do servidor");

        return modelAndView;
    }

    @GetMapping("/saudacao/{nome}")
    public ModelAndView saudacao(@PathVariable String nome) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("saudacao");
        modelAndView.addObject("nome", nome);

        return modelAndView;
    }

    // @GetMapping("/mensagem")
    // public String mensagem(ModelMap modelMap) {
        
    //     modelMap.addAttribute("mensagem", "Mensagem de boas vindas do servidor");
        
    //     return "mensagem";

    //     // model.addAttribute("mensagem", "Mensagem vinda do servidor!");
    //     // return "mensagem";
    // }

}
