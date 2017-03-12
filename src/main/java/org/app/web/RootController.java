package org.app.web;

import org.app.service.CarPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @Autowired
    private CarPartService service;

    @RequestMapping(value = "/")
    public String test(Model model){
        model.addAttribute("listItem", service.getAll());
        return "index";
    }
}
