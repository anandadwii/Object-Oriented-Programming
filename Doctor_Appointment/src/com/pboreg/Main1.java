package com.pboreg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main1 extends Application {
    private Stage primaryStage;
    protected BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Rumah Sakit Pusat Pembangunan Jaya");
        initRootLayout();
        initAwal();
    }

    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("scene/RootScene.fxml"));
            rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeRootCenter(String sceneName) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("scene/"+sceneName+".fxml"));
            AnchorPane apCenter = loader.load();

            rootLayout.setCenter(apCenter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setSceneSize(int width, int height)
    {
        primaryStage.setMinWidth(width);
        primaryStage.setMinHeight(height);
    }

    public void initAwal() {
        changeRootCenter("SusterInterface");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
