package com.sae.moutonloup.model;

public class Case {
    private Element element;
    private Animal animal;
    private boolean sortie;

    public Case(Element element, boolean sortie) {
        this.element = element;
        this.sortie = sortie;
        this.animal = null;
    }

    public boolean estAccessible() {
        return !(element instanceof Rocher) && animal == null;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Element getElement() {
        return element;
    }

    public boolean isSortie() {
        return sortie;
    }
}
