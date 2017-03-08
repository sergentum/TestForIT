package org.app.web;

import org.app.model.CarEntity;
import org.app.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class CarController {

//    @Autowired(required = true)
//    @Qualifier(value = "carService")
    @Autowired
    private CarService carService;

    /*@RequestMapping(value = "/")
    public String test(Model model){
        model.addAttribute("list", Arrays.asList(1, 2, 3));
        return "index";
    }*/

    @RequestMapping(value = "/cars")
    public String listCars(Model model) {
        model.addAttribute("carEntity", new CarEntity());
        model.addAttribute("listCars", carService.getAll());
        return "cars";
    }

    @RequestMapping(value = "/cars/add", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("car") CarEntity car) {
        if (car.getId() == 0L) {
            carService.add(car);
        } else {
            carService.update(car);
        }
        return "cars";
    }

    @RequestMapping("/cars/remove/{id}")
    public String removeCar(@PathVariable("id") long id) {
        carService.remove(id);
        return "cars";
    }

    @RequestMapping("/cars/edit/{id}")
    public String editCar(@PathVariable("id") long id, Model model) {
        model.addAttribute("car", carService.getById(id));
        model.addAttribute("listCars", carService.getAll());
        return "cars";
    }
}
