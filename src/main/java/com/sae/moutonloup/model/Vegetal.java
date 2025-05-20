package com.sae.moutonloup.model;

public abstract class Vegetal extends Element {
    protected int boost;

    public Vegetal(String type, int boost) {
        super(type);
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }
}
