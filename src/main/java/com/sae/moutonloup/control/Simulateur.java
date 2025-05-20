package com.sae.moutonloup.control;

import com.sae.moutonloup.model.*;

public class Simulateur {
    private Labyrinthe labyrinthe;
    private Mouton mouton;
    private Loup loup;
    private int nbTours = 0;
    private int nbHerbe = 0, nbCactus = 0, nbMarguerite = 0;

    public Simulateur(Labyrinthe labyrinthe, Mouton mouton, Loup loup) {
        this.labyrinthe = labyrinthe;
        this.mouton = mouton;
        this.loup = loup;
    }

    public void demarrerSimulation() {
        while (true) {
            nbTours++;

            deplacerMouton();
            if (moutonSurSortie()) {
                afficherResultat("Mouton");
                break;
            }


            deplacerLoup();
            if (loupAttrapeMouton()) {
                afficherResultat("Loup");
                break;
            }
        }
    }

    private void deplacerMouton() {
        Position pos = mouton.getPosition();
        Case caseActuelle = labyrinthe.getCase(pos.getX(), pos.getY());

        Element element = caseActuelle.getElement();
        if (element instanceof Vegetal vegetal) {
            mouton.vitesse = vegetal.getBoost();

            switch (vegetal.getType()) {
                case "Herbe" -> nbHerbe++;
                case "Cactus" -> nbCactus++;
                case "Marguerite" -> nbMarguerite++;
            }
        }

        // Déplacement aléatoire temporaire (à remplacer par contrôles manuels ou IA plus tard)
        mouton.deplacer(1, 0); // ex : avance vers la droite
    }

    private void deplacerLoup() {
        // Déplacement aléatoire temporaire
        loup.deplacer(-1, 0); // ex : avance vers la gauche
    }

    private boolean moutonSurSortie() {
        Position pos = mouton.getPosition();
        return labyrinthe.getCase(pos.getX(), pos.getY()).isSortie();
    }

    private boolean loupAttrapeMouton() {
        return mouton.getPosition().distance(loup.getPosition()) == 0;
    }

    private void afficherResultat(String gagnant) {
        System.out.println("Victoire du : " + gagnant);
        System.out.println("Nombre de tours : " + nbTours);
        System.out.println("Herbes mangées : " + nbHerbe);
        System.out.println("Marguerites mangées : " + nbMarguerite);
        System.out.println("Cactus mangés : " + nbCactus);
    }
}
