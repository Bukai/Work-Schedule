package myproject.web;

import myproject.entity.Employee;
import myproject.repositories.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private final EmployeeRepo employeeRepo;

    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/index")
    public String Employess(){
        return "index";
    }

    @GetMapping("/employee/add")
    public String addEmployess(){
        return "/employess/add";
    }
}
