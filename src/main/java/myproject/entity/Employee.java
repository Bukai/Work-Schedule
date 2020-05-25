package myproject.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public @Data
class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String address;
    @NotEmpty
    private String phone;

    private String email;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String pesel;

    private double rgb;

    @ManyToMany(mappedBy = "employees")
    private List<Order> ordersEmployees = new ArrayList<>();

}
