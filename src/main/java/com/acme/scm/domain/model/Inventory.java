package com.acme.scm.domain.model;

public class Inventory {
    private int id;

    private Warehouse warehouse;

    private Product product;

    private float stock;

    public Inventory(Warehouse warehouse, Product product) {
        this.warehouse = warehouse;
        this.product = product;
        this.id = generateId();
        this.stock = 0f;
    }

    public Inventory(Warehouse warehouse, Product product, float initialStock) {
        this.warehouse = warehouse;
        this.product = product;
        this.stock = initialStock;
    }

    private int generateId() {
        return 0;
    }

    public void executeOperation(InventoryOperationType operationType, float quantity) {
        this.stock = operationType.equals(InventoryOperationType.INPUT) ? stock + quantity : stock - quantity;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}
