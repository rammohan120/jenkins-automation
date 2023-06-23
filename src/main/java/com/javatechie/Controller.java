package com.javatechie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String wellCome(){
        return "Wellcome To Ram Mohan Jenkins";
    }
}
