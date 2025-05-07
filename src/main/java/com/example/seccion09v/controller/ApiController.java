package com.example.seccion09v.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @GetMapping("/saludo")
    public String hola(){
        return "HOLA";
    }

    @GetMapping("/despedida")
    public String chao(){
        return "CHAO";
    }

}
