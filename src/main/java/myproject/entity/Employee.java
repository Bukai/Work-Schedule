package myproject.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String firstName;
    @NotNull
    private String surname;
    @NotNull
    private String address;
    @NotNull
    private String phone;

    private String email;
    @NotNull
    @Size(min = 11, max = 11)
    private String pesel;

    @NotNull
    private double rgb;

    @ManyToMany(mappedBy = "employees")
    private List<Order> ordersEmployees = new ArrayList<>();

}
