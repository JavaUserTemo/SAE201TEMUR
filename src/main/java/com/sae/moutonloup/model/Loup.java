package com.sae.moutonloup.model;

public class Loup extends Animal {
    public Loup(Position position) {
        super(3, position);
    }

    public void chasse() {
        System.out.println("Le loup chasse !");
    }

    @Override
    public void voir() {
        System.out.println("Le loup cherche une proie.");
    }
}
