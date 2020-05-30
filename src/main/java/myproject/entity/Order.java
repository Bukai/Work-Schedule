package myproject.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String description;

    @ManyToMany
    private Set<Customers> customers = new HashSet<Customers>();

    @ManyToMany
    private Set<Employee> employees = new HashSet<Employee>();

    @ManyToOne
    private Parts parts;

    private double cost;
    private double profit;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "created_on")
    private LocalDate createdOn;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "end_on")
    private LocalDate endOn;

    @ManyToMany
    private Set<OrderStage> orderStage = new HashSet<>();
}
