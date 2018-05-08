package ru.sergentum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    @RequestMapping(value = "/cars")
    public String listCars() {
        System.out.println("cars get");
        return "cars";
    }
}
