package com.sae.moutonloup.model;

public class Labyrinthe {
    private int nbColonne;
    private int nbLigne;
    private Case[][] grille;

    public Labyrinthe(int nbColonne, int nbLigne) {
        this.nbColonne = nbColonne;
        this.nbLigne = nbLigne;
        grille = new Case[nbLigne][nbColonne];
    }

    public Case getCase(int x, int y) {
        return grille[y][x];
    }

    public void setCase(int x, int y, Case c) {
        grille[y][x] = c;
    }

    public int getNbColonne() { return nbColonne; }
    public int getNbLigne() { return nbLigne; }
}
