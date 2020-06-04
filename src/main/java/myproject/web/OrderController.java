package myproject.web;

import myproject.entity.*;
import myproject.repositories.OrderRepo;
import myproject.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user/order")
public class OrderController {

    private final OrderRepo orderRepo;
    private final OrderService orderService;
    private final CustomerService customerService;
    private final PartsService partsService;
    private final StageService stageService;
    private final EmployeeService employeeService;

    public OrderController(OrderRepo orderRepo, OrderService orderService, CustomerService customerService,
                           PartsService partsService, StageService stageService, EmployeeService employeeService) {
        this.orderRepo = orderRepo;
        this.orderService = orderService;
        this.customerService = customerService;
        this.partsService = partsService;
        this.stageService = stageService;
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public String Parts(Model model){
        List<Order> ordersList = orderService.listAll();
        model.addAttribute("ordersList", ordersList);
        return "order";
    }

    @GetMapping("/add")
    public String newParts(Model model){
        List<Customers> customers = customerService.listAll();
        List<Parts> parts = partsService.listAll();
        List<OrderStage> stages = stageService.listAll();
        List<Employee> employees = employeeService.listAll();
        model.addAttribute("orders", new Order());
        model.addAttribute("customers", customers);
        model.addAttribute("parts", parts);
        model.addAttribute("stages", stages);
        model.addAttribute("employees", employees);
        return "addOrder";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("orders") Order order){
        orderService.save(order);
        return "redirect:/user/order";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editStage(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("editOrder");
        Order order = orderService.get(id);
        List<Customers> customers = customerService.listAll();
        List<Parts> parts = partsService.listAll();
        List<OrderStage> stages = stageService.listAll();
        List<Employee> employees = employeeService.listAll();
        modelAndView.addObject("editOrder", order);
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("parts", parts);
        modelAndView.addObject("stages", stages);
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteStage(@PathVariable(name = "id") long id){
        orderService.delete(id);
        return "redirect:/user/order";
    }
}
