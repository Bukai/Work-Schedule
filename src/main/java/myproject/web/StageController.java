package myproject.web;

import myproject.entity.stage.OrderStage;
import myproject.repositories.StageRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StageController {

    private StageRepo stageRepo;

    public StageController(StageRepo stageRepo) {
        this.stageRepo = stageRepo;
    }

    @GetMapping("/stage")
    public String Stage(){
        return "stage";
    }

    @GetMapping("/stage/add")
    public String addStage(){
        OrderStage orderStage = new OrderStage(1, "Przyjety");
        OrderStage orderStage2 = new OrderStage(2, "zakonczony");
        OrderStage orderStage3 = new OrderStage(3, "Gotowy");
        stageRepo.save(orderStage);
        stageRepo.save(orderStage2);
        stageRepo.save(orderStage3);
        return "stage";
    }
}
