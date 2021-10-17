package com.pboreg.library;

import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenController {
    public void switchScreen(String sceneName, String sceneTitle, AnchorPane ap){
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("../scene/"+sceneName+".fxml"));
        } catch (IOException ex) {
            ex.getMessage();
        }
        Scene scene = new Scene(root);
        stage.setTitle(sceneTitle);
        stage.setScene(scene);
        stage.show();
        ap.getScene().getWindow().hide();
    }
}

