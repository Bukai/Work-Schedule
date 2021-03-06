package myproject.web;

import myproject.entity.Employee;
import myproject.repositories.EmployeeRepo;
import myproject.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("user/employee")
public class EmployeeController {

    private final EmployeeRepo employeeRepo;

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeRepo employeeRepo, EmployeeService employeeService) {
        this.employeeRepo = employeeRepo;
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public String Employess(Model model){
        List<Employee> employeeList = employeeService.listAll();
        model.addAttribute("employeeList", employeeList);
        return "employee";
    }

    @GetMapping("/add")
    public String NewEmploye(Model model){
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @PostMapping("/add")
    public String AddEmployee(Employee employee){
        employeeService.save(employee);
        return "redirect:/user/employee";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView EditEmployee(@PathVariable(name = "id") long id){
        ModelAndView modelAndView = new ModelAndView("editEmployee");
        Employee employee = employeeService.get(id);
        modelAndView.addObject("editemployee", employee);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String DeleteEmployee(@PathVariable(name = "id") long id){
        employeeService.delete(id);
        return "redirect:/user/employee";
    }
}
