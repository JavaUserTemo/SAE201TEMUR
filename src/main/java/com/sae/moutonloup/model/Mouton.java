package com.sae.moutonloup.model;

public class Mouton extends Animal {
    public Mouton(Position position) {
        super(2, position);
    }

    public void paitre() {
        System.out.println("Le mouton mange tranquillement.");
    }

    public void fuite() {
        System.out.println("Le mouton fuit !");
    }

    @Override
    public void voir() {
        System.out.println("Le mouton regarde autour de lui.");
    }
}
