package org.app.web;

import org.app.model.CarEntity;
import org.app.model.CarPartEntity;
import org.app.model.PartEntity;
import org.app.service.CarPartService;
import org.app.service.CarService;
import org.app.service.PartService;
import org.app.util.AdvancedUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Comparator;

@Controller
public class RootController {

    @Autowired
    private CarPartService service;

    @Autowired
    private CarService carService;

    @Autowired
    private PartService partService;

    @RequestMapping(value = "/")
    public String test(Model model){
        model.addAttribute("item", new CarPartEntity());
        model.addAttribute("listItem", AdvancedUtil.sortList(service.getAll(), Comparator.comparing(CarPartEntity::getId)));
        model.addAttribute("listCars", AdvancedUtil.sortList(carService.getAll(), Comparator.comparing(CarEntity::getId)));
        model.addAttribute("listParts", AdvancedUtil.sortList(partService.getAll(), Comparator.comparing(PartEntity::getId)));
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("item") CarPartEntity item,
                         @ModelAttribute("carId") long carId,
                         @ModelAttribute("partId") long partId) {
        service.save(item, carId, partId);
        return "redirect:/";
    }

    @RequestMapping("/remove/{id}")
    public String removeCar(@PathVariable("id") long id) {
        service.remove(id);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String editCar(@PathVariable("id") long id, Model model) {
        model.addAttribute("item", service.getById(id));
        model.addAttribute("listItem", service.getAll());
        return "index";
    }
}
