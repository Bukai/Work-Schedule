package myproject.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
@Data
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String companyName;

    private String firstName;
    private String surname;

    @NotEmpty
    private String address;

    @NotEmpty
    @Size(min = 10, max = 10)
    private String nip;

    @NotEmpty
    private String phone;
    @NotEmpty
    private String email;

    @OneToMany(mappedBy = "customers")
    private List<Order> orders =
            new ArrayList<>();

}
