
package com.example.demo;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    int id;

    @OneToMany(mappedBy = "customer")
    List<Order> orders;

    public Customer() {
    }
}