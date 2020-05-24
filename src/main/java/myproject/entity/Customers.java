package myproject.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
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

    public Customers(long id, @NotEmpty String companyName, String firstName, String surname, @NotEmpty String address,
                     @NotEmpty @Size(min = 10, max = 10) String nip, @NotEmpty String phone, @NotEmpty String email,
                     List<Order> orders) {
        this.id = id;
        this.companyName = companyName;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.nip = nip;
        this.phone = phone;
        this.email = email;
        this.orders = orders;
    }

    public Customers(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", nip='" + nip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                '}';
    }
}
