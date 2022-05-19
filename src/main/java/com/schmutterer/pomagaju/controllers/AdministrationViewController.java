package com.schmutterer.pomagaju.controllers;

import com.schmutterer.pomagaju.PomagajuApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministrationViewController {

    @FXML
    private Button btnLogout;

    @FXML
    protected void onLogoutButtonClick() throws IOException {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PomagajuApplication.class.getResource("login-view.fxml"));
        Scene registrationScene = new Scene(fxmlLoader.load());
        stage.setTitle("Pomagaju - Administration");
        stage.setScene(registrationScene);
        stage.show();
    }

}
