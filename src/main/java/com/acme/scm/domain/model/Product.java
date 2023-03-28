package com.acme.scm.domain.model;

public class Product {
    private int id;
    private String name;

    public Product() {
        this.id = generateId();
        this.name = "";
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(String name) {
        this.name = name;
        this.id = generateId();
    }

    private int generateId() {
        return 0;
    }
}
