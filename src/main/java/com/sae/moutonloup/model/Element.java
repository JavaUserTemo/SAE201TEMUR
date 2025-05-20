package com.sae.moutonloup.model;

public abstract class Element {
    protected String type;

    public Element(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
