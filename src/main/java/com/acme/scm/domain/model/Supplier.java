package com.acme.purchasing.domain.model;

import com.acme.shared.domain.model.Person;

public class Supplier extends Person {
    private int level;

    public Supplier(int level) {
        this.level = level;
    }

    public Supplier changeLevel(int newLevel) {
        level = newLevel;
        return this;
    }
}
