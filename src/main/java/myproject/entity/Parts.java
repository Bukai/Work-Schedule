package myproject.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parts")
public @Data class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    @NotNull
    private double quantity;

    @NotNull
    private double sellingCost;

    @NotNull
    private double costOfPurchase;

    @ManyToMany(mappedBy = "parts")
    private List<Order> ordersParts =
            new ArrayList<>();

}
