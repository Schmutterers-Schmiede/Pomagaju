package com.schmutterer.pomagaju;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PomagajuApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PomagajuApplication.class.getResource("login-view.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Pomagaju - Login");
        stage.setScene(loginScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
