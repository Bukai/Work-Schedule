package myproject.web;

import myproject.entity.OrderStage;
import myproject.repositories.StageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/stage")
public class StageController {

    private final StageRepo stageRepo;

    public StageController(final StageRepo stageRepo) {
        this.stageRepo = stageRepo;
    }

//    @ModelAttribute("orderStage")
//    public List<OrderStage> getStage(){
//        return stageRepo.findAll();
//    }

    @GetMapping("")
    public String Stage(){
        return "stage";
    }

    @GetMapping("/add")
    public String addStage(Model model){
        model.addAttribute("orderStage", new OrderStage());
        return "aaa";
    }

    @PostMapping("/add")
    public String processStage(@ModelAttribute OrderStage orderStage){
        stageRepo.save(orderStage);
        return "redirect:/stage";
    }

//    @RequestMapping("/delete/{id}")
//    public String deleteCar(@PathVariable long id) {
//        Optional<OrderStage> stageDelete = stageRepo.findById(id);
//        stageDelete.ifPresent(stageRepo::delete);
//        return "redirect:/dashboard/cars/list";
//    }
}
