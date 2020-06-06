package myproject.web;



import myproject.entity.Employee;
import myproject.entity.Order;
import myproject.service.EmployeeService;
import myproject.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/order/details/employees")
public class DetailsEmployeeOrderController {

    private final OrderService orderService;
    private final EmployeeService employeeService;

    public DetailsEmployeeOrderController(OrderService orderService, EmployeeService employeeService) {
        this.orderService = orderService;
        this.employeeService = employeeService;
    }

    @GetMapping("/add/{id}")
    public String NewDetailOrder(Model model, @PathVariable long id){
        Order orders = orderService.get(id);
        List<Employee> employees = employeeService.listAll();
        model.addAttribute("orders", orders);
        model.addAttribute("detailsEmployees", employees);
        return "addDetailsEmployee";
    }

    @PostMapping("/add/{id}")
    public String AddDetailOrder(Order order){
        orderService.save(order);
        return "redirect:/user/order/details/{id}";
    }

    @GetMapping("/delete/{id}")
    public String DeleteDetail(@PathVariable(name = "id") long id){
        employeeService.delete(id);
        return "redirect:/user/order/details/{id}";
    }
}
