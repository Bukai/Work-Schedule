package myproject.web;

import myproject.entity.*;
import myproject.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user/order/details")
public class DetailsPartsOrderController {

    private final OrderService orderService;
    private final PartsService partsService;
    private final EmployeeService employeeService;

    public DetailsPartsOrderController(OrderService orderService, PartsService partsService, EmployeeService employeeService) {
        this.orderService = orderService;
        this.partsService = partsService;
        this.employeeService = employeeService;
    }


    @GetMapping("/{id}")
    public String DetailsOrder(Model model, @PathVariable long id){
        List<Order> ordersList = orderService.listAll();
        model.addAttribute("ordersList", ordersList);
        return "detailsOrder";
    }

    @GetMapping("/{id}/add")
    public String NewOrder(Model model, @PathVariable long id){
        Order orders = orderService.get(id);
        List<Parts> parts = partsService.listAll();
        List<Employee> employees = employeeService.listAll();
        model.addAttribute("orders", orders);
        model.addAttribute("detailsPart", parts);
        model.addAttribute("employees", employees);
        return "addDetailsPart";
    }

    @PostMapping("/{id}/add")
    public String AddOrder(Order order){
        orderService.save(order);
        return "redirect:/user/order/details/{id}";
    }
}
