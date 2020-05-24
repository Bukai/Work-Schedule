package myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
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

    public Order(long id, @NotEmpty String description, Customers customers, List<Employee> employees, List<Parts> parts,
                 double cost, double profit, LocalDateTime createdOn, LocalDateTime endOn, OrderStage orderStage) {
        this.id = id;
        this.description = description;
        this.customers = customers;
        this.employees = employees;
        this.parts = parts;
        this.cost = cost;
        this.profit = profit;
        this.createdOn = createdOn;
        this.endOn = endOn;
        this.orderStage = orderStage;
    }

    public Order(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Parts> getParts() {
        return parts;
    }

    public void setParts(List<Parts> parts) {
        this.parts = parts;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getEndOn() {
        return endOn;
    }

    public void setEndOn(LocalDateTime endOn) {
        this.endOn = endOn;
    }

    public OrderStage getOrderStage() {
        return orderStage;
    }

    public void setOrderStage(OrderStage orderStage) {
        this.orderStage = orderStage;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", customers=" + customers +
                ", employees=" + employees +
                ", parts=" + parts +
                ", cost=" + cost +
                ", profit=" + profit +
                ", createdOn=" + createdOn +
                ", endOn=" + endOn +
                ", orderStage=" + orderStage +
                '}';
    }
}
