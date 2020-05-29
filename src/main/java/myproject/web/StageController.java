package myproject.web;

import myproject.entity.OrderStage;
import myproject.repositories.StageRepo;
import myproject.service.StageService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("admin/stage")
public class StageController {

    private final StageRepo stageRepo;

    private final StageService stageService;

    public StageController(StageRepo stageRepo, StageService stageService) {
        this.stageRepo = stageRepo;
        this.stageService = stageService;
    }

    @GetMapping("")
    public String Stage(Model model){
        List<OrderStage> listStage = stageService.listAll();
        model.addAttribute("listStage", listStage);
        return "stage";
    }

    @GetMapping("/messageAdmin")
    public String error(){
        return "messageAdmin";
    }

    @GetMapping("/add")
    public String addStage(Model model){
        model.addAttribute("orderStage", new OrderStage());
        return "addStage";
    }

    @PostMapping("/add")
    public String processStage(@ModelAttribute("orderStage") OrderStage orderStage){
        stageService.save(orderStage);
        return "redirect:/admin/stage";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editStage(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("editStage");
        OrderStage orderStage = stageService.get(id);
        modelAndView.addObject("stage", orderStage);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteStage(@PathVariable(name = "id") long id){
        stageService.delete(id);
        return "redirect:/admin/stage";
    }
}
