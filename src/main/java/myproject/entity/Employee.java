package myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

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

    public Employee(long id, @NotEmpty String firstName, @NotEmpty String surname, @NotEmpty String address,
                    @NotEmpty String phone, String email, @NotEmpty @Size(min = 11, max = 11) String pesel,
                    double rgb, List<Order> ordersEmployees) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.pesel = pesel;
        this.rgb = rgb;
        this.ordersEmployees = ordersEmployees;
    }

    public Employee(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public double getRgb() {
        return rgb;
    }

    public void setRgb(double rgb) {
        this.rgb = rgb;
    }

    public List<Order> getOrders() {
        return ordersEmployees;
    }

    public void setOrders(List<Order> orders) {
        this.ordersEmployees = ordersEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pesel='" + pesel + '\'' +
                ", rgb=" + rgb +
                ", orders=" + ordersEmployees +
                '}';
    }
}
