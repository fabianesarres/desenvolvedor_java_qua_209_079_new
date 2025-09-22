package com.modularizacao.modularizacao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ModuloController {
    @RequestMapping("/") 
    public String index(){
        return "index";
    }
}
