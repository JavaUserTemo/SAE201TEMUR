package com.sae.moutonloup.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button; // ✅ À ajouter
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MenuController {

    @FXML
    private Button jouerButton;

    public void demarrerJeu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/sae/moutonloup/Editeur.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Jeu du Loup");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
