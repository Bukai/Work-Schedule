package myproject.web;

import myproject.entity.Employee;
import myproject.entity.Order;
import myproject.service.EmployeeService;
import myproject.service.OrderService;
import myproject.service.PartsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/order/details")
public class DetailsOrderController {

    private final OrderService orderService;
    private final PartsService partsService;
    private final EmployeeService employeeService;

    public DetailsOrderController(OrderService orderService, PartsService partsService, EmployeeService employeeService) {
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
}
