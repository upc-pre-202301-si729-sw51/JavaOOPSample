package com.acme.crm.domain.model;

import com.acme.scm.domain.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesOrder {
    private int id;
    private Date registeredAt;

    private Customer customer;

    private List<SalesOrderItem> items;


    public SalesOrder(int id, Date registeredAt, Customer customer) {
        this.id = id;
        this.registeredAt = registeredAt;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public SalesOrder() {
        id = generateId();
        registeredAt = new Date();
        this.items = new ArrayList<>();
    }

    public SalesOrder(Customer customer) {
        this.customer = customer;
        registeredAt = new Date();
        id = generateId();
        this.items = new ArrayList<>();
    }

    private int generateId() {
        return 0;
    }

    public void addItem(float quantity, float unitPrice, Product product) {
        SalesOrderItem item = new SalesOrderItem(this, quantity, unitPrice, product);
        items.add(item);
    }

    public float calculateOrderPrice() {
        return items.stream().map(salesOrderItem -> salesOrderItem.calculateItemPrice()).reduce(0f, Float::sum);
    }
}
