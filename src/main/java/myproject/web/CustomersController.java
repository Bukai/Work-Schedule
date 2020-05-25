package myproject.web;

import myproject.entity.Customers;
import myproject.repositories.CustomersRepo;
import myproject.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomersController {

    private final CustomersRepo customersRepo;
    private final CustomerService customerService;

    public CustomersController(CustomersRepo customersRepo, CustomerService customerService) {
        this.customersRepo = customersRepo;
        this.customerService = customerService;
    }

    @GetMapping("")
    public String Parts(Model model){
        List<Customers> customerList = customerService.listAll();
        model.addAttribute("customerList", customerList);
        return "customer";
    }

    @GetMapping("/add")
    public String newParts(Model model){
        model.addAttribute("customers", new Customers());
        return "addCustomer";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("customers") Customers customers){
        customerService.save(customers);
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editStage(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("editCustomer");
        Customers customers = customerService.get(id);
        modelAndView.addObject("editCustomer", customers);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteStage(@PathVariable(name = "id") long id){
        customerService.delete(id);
        return "redirect:/customer";
    }
}
