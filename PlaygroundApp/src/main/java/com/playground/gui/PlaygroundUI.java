package com.playground.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;



public class PlaygroundUI extends Application {

    public static final String playgroundIcon= "/com.playground.gui/images/playground.png";

    public static Window primaryStageWindow;
    protected static Stage primaryStage;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        PlaygroundUI.primaryStage = primaryStage;
        Parent root = new AnchorPane();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(playgroundIcon));
        primaryStage.setTitle("Playground Project");


        primaryStageWindow = primaryStage.getScene().getWindow();

        primaryStage.setOnCloseRequest((WindowEvent e) -> {
            Platform.exit();
            System.exit(0);
        });

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com.playground.gui/PlaygroundUIController.fxml"));
        scene.setRoot(loader.load());
        scene.setUserData(loader.getController());
        primaryStage.show();
        primaryStage.setMinHeight(scene.getHeight() + 20);
        primaryStage.setMinWidth(scene.getWidth());


    }
}
