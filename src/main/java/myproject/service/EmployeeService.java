package myproject.service;

import myproject.entity.Employee;
import myproject.entity.OrderStage;
import myproject.repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmplyeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> listAll(){
        return employeeRepo.findAll();
    }

    public void save(Employee employee){
        employeeRepo.save(employee);
    }

    public Employee get(long id){
        return employeeRepo.findById(id).get();
    }

    public void delete(long id){
        employeeRepo.deleteById(id);
    }
}
