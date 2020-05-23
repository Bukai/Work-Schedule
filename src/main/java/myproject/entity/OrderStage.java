package myproject.entity.stage;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "orderstage")
public class OrderStage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    public OrderStage(int id, @NotEmpty String name) {
        this.id = id;
        this.name = name;
    }

    public OrderStage() {
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
