package myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parts")
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    @NotEmpty
    private int quantity;

    @NotEmpty
    private double sellingCost;

    @NotEmpty
    private double costOfPurchase;

    @ManyToMany(mappedBy = "parts")
    private List<Order> ordersParts =
            new ArrayList<>();

    public Parts(long id, @NotEmpty String name, @NotEmpty int quantity, @NotEmpty double sellingCost,
                 @NotEmpty double costOfPurchase, List<Order> ordersParts) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.sellingCost = sellingCost;
        this.costOfPurchase = costOfPurchase;
        this.ordersParts = ordersParts;
    }

    public Parts(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSellingCost() {
        return sellingCost;
    }

    public void setSellingCost(double sellingCost) {
        this.sellingCost = sellingCost;
    }

    public double getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(double costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }

    public List<Order> getOrders() {
        return ordersParts;
    }

    public void setOrders(List<Order> orders) {
        this.ordersParts = ordersParts;
    }

    @Override
    public String toString() {
        return "Parts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", sellingCost=" + sellingCost +
                ", costOfPurchase=" + costOfPurchase +
                ", orders=" + ordersParts +
                '}';
    }
}
