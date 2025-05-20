package com.sae.moutonloup.model;

public abstract class Animal {
    private int vitesse;
    protected Position position;

    public Animal(int vitesse, Position position) {
        this.vitesse = vitesse;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void deplacer(int dx, int dy) {
        position.setX(position.getX() + dx * vitesse);
        position.setY(position.getY() + dy * vitesse);
    }
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }


    public abstract void voir();
}

