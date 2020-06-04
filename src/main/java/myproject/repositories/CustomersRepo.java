package myproject.repositories;

import myproject.entity.Customers;
import myproject.service.CustomerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepo extends JpaRepository<Customers, Long> {

}
