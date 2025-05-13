package com.sae.moutonloup.model;

import java.util.ArrayList;

public class Case {
    private ArrayList<Element> lElement;
    private ArrayList<Animal> lAnimal;
    private boolean sortie;

    public Case(Element lElement, Animal lAnimal, boolean sortie) {

    }

    public boolean isSortie() {
        return sortie;
    }

    public void setSortie(boolean sortie) {
        this.sortie = sortie;
    }

    public boolean estAccessible(){

        return false;
    }
}
