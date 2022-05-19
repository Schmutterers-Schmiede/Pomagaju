package com.schmutterer.pomagaju.controllers;

import com.schmutterer.pomagaju.PomagajuApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationViewController {

    @FXML
    private Button btnCancel;

    @FXML
    protected void onCancelButtonClick() throws IOException {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PomagajuApplication.class.getResource("login-view.fxml"));
        Scene registrationScene = new Scene(fxmlLoader.load());
        stage.setTitle("Pomagaju - Administration");
        stage.setScene(registrationScene);
        stage.show();
    }

}
