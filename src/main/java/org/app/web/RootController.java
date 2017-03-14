package org.app.web;

import org.app.model.CarEntity;
import org.app.model.CarPartEntity;
import org.app.model.PartEntity;
import org.app.service.CarPartService;
import org.app.service.CarService;
import org.app.service.PartService;
import org.app.to.CarPartTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Comparator;
import java.util.stream.Collectors;

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
        model.addAttribute("itemTo", new CarPartTo());

        model.addAttribute("mapCars", carService.getAll().stream()
                .sorted(Comparator.comparing(CarEntity::getId))
                .collect(Collectors.toMap(CarEntity::getId, CarEntity::getName)));
        model.addAttribute("mapParts", partService.getAll().stream()
                .sorted(Comparator.comparing(PartEntity::getId))
                .collect(Collectors.toMap(PartEntity::getId, PartEntity::getName)));

        model.addAttribute("listItem", service.getAll().stream()
                .sorted(Comparator.comparing(CarPartEntity::getId))
                .collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addCar(@ModelAttribute("itemTo") CarPartTo item) {
        service.save(item);
        return "redirect:/";
    }

    @RequestMapping("/remove/{id}")
    public String removeCar(@PathVariable("id") long id) {
        service.remove(id);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String editCar(@PathVariable("id") long id, Model model) {
        CarPartEntity item = service.getById(id);

        CarPartTo itemTo = new CarPartTo();
        itemTo.setId(item.getId());
        itemTo.setCarId(item.getCarEntity().getId());
        itemTo.setPartId(item.getPartEntity().getId());
        model.addAttribute("itemTo", itemTo);

        model.addAttribute("mapCars", carService.getAll().stream()
                .sorted(Comparator.comparing(CarEntity::getId))
                .collect(Collectors.toMap(CarEntity::getId, CarEntity::getName)));
        model.addAttribute("mapParts", partService.getAll().stream()
                .sorted(Comparator.comparing(PartEntity::getId))
                .collect(Collectors.toMap(PartEntity::getId, PartEntity::getName)));

        model.addAttribute("listItem", service.getAll().stream()
                .sorted(Comparator.comparing(CarPartEntity::getId))
                .collect(Collectors.toList()));
        return "index";
    }
}
