package br.com.juntaeapp.mvc.juntae_demo.controller;

import br.com.juntaeapp.mvc.juntae_demo.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    AlunoRepository repository;

    @GetMapping
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }

}