package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "order_line_items")
public class OrderLineItem {
    @Id
    int id;

    @Column(name = "book_id")
    int bookId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    Double price;
    Double quantity;

    public OrderLineItem() {
    }
}