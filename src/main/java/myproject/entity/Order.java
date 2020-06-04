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
    private List<Customers> customers = new ArrayList<>();
    @ManyToMany
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany
    private List<Parts> parts = new ArrayList<>();

    private double cost;
    private double profit;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "created_on")
    private LocalDate createdOn;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "end_on")
    private LocalDate endOn;

    @ManyToMany
    private List<OrderStage> orderStage = new ArrayList<>();

}
