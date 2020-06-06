package myproject.web;



import myproject.entity.Order;
import myproject.entity.Parts;
import myproject.service.EmployeeService;
import myproject.service.OrderService;
import myproject.service.PartsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/order/details/parts")
public class DetailsPartsOrderController {

    private final OrderService orderService;
    private final PartsService partsService;
    private final EmployeeService employeeService;

    public DetailsPartsOrderController(OrderService orderService, PartsService partsService, EmployeeService employeeService) {
        this.orderService = orderService;
        this.partsService = partsService;
        this.employeeService = employeeService;
    }

    @GetMapping("add/{id}")
    public String NewDetailOrder(Model model, @PathVariable long id){
        Order orders = orderService.get(id);
        List<Parts> parts = partsService.listAll();
        model.addAttribute("orders", orders);
        model.addAttribute("detailsPart", parts);

        return "addDetailsPart";
    }

    @PostMapping("add/{id}")
    public String AddDetailOrder(Order order){
        orderService.save(order);
        return "redirect:/user/order/details/{id}";
    }

    @GetMapping("/delete/{id}")
    public String DeleteDetail(@PathVariable(name = "id") long id){
        partsService.delete(id);

        return "redirect:/user/order/details/{id}";
    }
}
