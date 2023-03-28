package com.acme.scm.domain.model;

import com.acme.shared.domain.model.Address;

public class Warehouse {
    private int id;
    private String name;

    private Address address;

    public Warehouse(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    private int generateId() {
        return 0;
    }
}
