package myproject.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String description;

    @ManyToOne
    private Customers customers;

    @ManyToMany
    @JoinTable(name = "order_employees")
    private List<Employee> employees = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "order_parts")
    private List<Parts> parts = new ArrayList<>();

    private double cost;
    private double profit;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "end_on")
    private LocalDateTime endOn;

    @ManyToOne
    private OrderStage orderStage;
}
