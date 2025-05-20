package com.sae.moutonloup.view;

import com.sae.moutonloup.control.Simulateur;
import com.sae.moutonloup.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class SimulateurController {

    @FXML
    private GridPane grilleLabyrinthe;

    @FXML
    private Button boutonDemarrer;

    private Labyrinthe labyrinthe;
    private Mouton mouton;
    private Loup loup;
    private Simulateur simulateur;

    @FXML
    public void initialize() {
        this.labyrinthe = new Labyrinthe(10, 10);
        this.mouton = new Mouton(new Position(1, 1));
        this.loup = new Loup(new Position(8, 8));
        this.simulateur = new Simulateur(labyrinthe, mouton, loup);

        // Affichage des cases dans la grille
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                Button caseBouton = new Button();
                caseBouton.setPrefSize(40, 40);
                caseBouton.setText(x + "," + y); // ou vide si tu préfères
                grilleLabyrinthe.add(caseBouton, x, y);
            }
        }
    }


    @FXML
    public void demarrerSimulation() {
        System.out.println("Simulation démarrée");
        simulateur.demarrerSimulation();

    }
}
