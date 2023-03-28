package com.acme.scm.domain.model;

import java.util.Date;

public class InventoryOperation {
    private int id;

    private InventoryTransaction transaction;

    private Date registeredAt;

    public InventoryOperation(InventoryTransaction transaction, Inventory inventory, float quantity, InventoryOperationType operationType) {
        this.transaction = transaction;
        this.inventory = inventory;
        this.quantity = quantity;
        this.operationType = operationType;
        this.id = generateId();
        this.registeredAt = new Date();
        this.inventory.executeOperation(operationType, quantity);
    }

    private int generateId() {
        return 0;
    }

    private Inventory inventory;

    private float quantity;

    private InventoryOperationType operationType;
}
