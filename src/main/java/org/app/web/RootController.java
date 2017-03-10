package org.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

//    @Autowired
//    private CarService carService;

    @RequestMapping(value = "/")
    public String test(Model model){
        return "index";
    }
}
