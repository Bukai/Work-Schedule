package myproject.service;

import myproject.entity.Customers;
import myproject.entity.Order;
import myproject.repositories.CustomersRepo;
import myproject.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private CustomersRepo customersRepo;

    public List<Order> listAll(){
        return orderRepo.findAll();
    }

    public void save(Order order){
        orderRepo.save(order);
    }

    public Order get(long id){
        return orderRepo.findById(id).get();
    }

    public void delete(long id){
        orderRepo.deleteById(id);
    }

    public List<Customers> customersList() {
        return customersRepo.findAll();
    }

}
