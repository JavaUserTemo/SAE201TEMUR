package com.sae.moutonloup.model;

public abstract class Animal {
    private int vitesse;
    private Position position;

    public Animal(int v, Position p) {
        this.vitesse = v;
        this.position = p;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void deplacer(){

    }

    public void voir(){

    }
}
