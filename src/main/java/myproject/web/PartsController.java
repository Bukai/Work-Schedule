package myproject.web;

import myproject.entity.Parts;
import myproject.repositories.PartsRepo;
import myproject.service.PartsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/parts")
public class PartsController {

    private final PartsRepo partsRepo;
    private final PartsService partsService;

    public PartsController(PartsRepo partsRepo, PartsService partsService) {
        this.partsRepo = partsRepo;
        this.partsService = partsService;
    }

    @GetMapping("")
    public String Parts(Model model){
        List<Parts> partsList = partsService.listAll();
        model.addAttribute("partsList", partsList);
        return "parts";
    }

    @GetMapping("/add")
    public String newParts(Model model){
        model.addAttribute("parts", new Parts());
        return "addParts";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("parts") Parts parts){
        partsService.save(parts);
        return "redirect:/parts";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editStage(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("editParts");
        Parts parts = partsService.get(id);
        modelAndView.addObject("editParts", parts);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteStage(@PathVariable(name = "id") long id){
        partsService.delete(id);
        return "redirect:/parts";
    }
}
