package com.acme.scm.domain.model;

import java.util.Date;

public class InventoryTransaction {
    private int id;

    private Date registeredAt;

    public InventoryTransaction() {
        id = generateId();
        registeredAt = new Date();
    }

    private int generateId() {
        return 0;
    }


}
