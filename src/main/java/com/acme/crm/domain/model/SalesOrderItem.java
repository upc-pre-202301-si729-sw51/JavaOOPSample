package com.acme.crm.domain.model;

import com.acme.scm.domain.model.Product;

public class SalesOrderItem {
    private int id;
    private SalesOrder salesOrder;

    private float quantity;
    private float unitPrice;

    private Product product;

    public SalesOrderItem(int id, SalesOrder salesOrder, float quantity, float unitPrice, Product product) {
        this.id = id;
        this.salesOrder = salesOrder;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.product = product;
    }

    public SalesOrderItem(SalesOrder salesOrder, float quantity, float unitPrice, Product product) {
        this.salesOrder = salesOrder;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.product = product;
        this.id = generateId();
    }

    private int generateId() {
        return 0;
    }

    public float calculateItemPrice() {
        return quantity*unitPrice;
    }
}
