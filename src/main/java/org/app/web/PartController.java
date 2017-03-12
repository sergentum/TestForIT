package org.app.web;

import org.app.model.PartEntity;
import org.app.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PartController {

    @Autowired
    private PartService partService;

    @RequestMapping(value = "/parts")
    public String listParts(Model model) {
        model.addAttribute("partEntity", new PartEntity());
        List<PartEntity> listParts = partService.getAll();
        model.addAttribute("listParts", listParts.stream()
                .sorted(Comparator.comparing(PartEntity::getId))
                .collect(Collectors.toList()));
        return "parts";
    }

    @RequestMapping(value = "/parts/add", method = RequestMethod.POST)
    public String addPart(@ModelAttribute("partEntity") PartEntity part) {
        partService.save(part);
        return "redirect:/parts";
    }

    @RequestMapping("/parts/remove/{id}")
    public String removePart(@PathVariable("id") long id) {
        partService.remove(id);
        return "redirect:/parts";
    }

    @RequestMapping("/parts/edit/{id}")
    public String editPart(@PathVariable("id") long id, Model model) {
        model.addAttribute("partEntity", partService.getById(id));
        model.addAttribute("listParts", partService.getAll());
        return "parts";
    }
}
