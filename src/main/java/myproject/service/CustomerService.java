package myproject.service;

import myproject.entity.Customers;
import myproject.entity.Parts;
import myproject.repositories.CustomersRepo;
import myproject.repositories.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CutomerService {

    @Autowired
    private CustomersRepo customersRepo;

    public List<Customers> listAll(){
        return customersRepo.findAll();
    }

    public void save(Customers customers){
        customersRepo.save(customers);
    }

    public Customers get(long id){
        return customersRepo.findById(id).get();
    }

    public void delete(long id){
        customersRepo.deleteById(id);
    }
}
