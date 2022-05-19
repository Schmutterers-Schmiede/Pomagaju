package com.schmutterer.pomagaju.controllers;

import com.schmutterer.pomagaju.PomagajuApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController {

    @FXML
    private TextField userEmail;

    @FXML
    private PasswordField userPassword;

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnExit;

    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
    }

    @FXML
    protected void onLoginButtonClick() throws IOException {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PomagajuApplication.class.getResource("administration-view.fxml"));
        Scene registrationScene = new Scene(fxmlLoader.load());
        stage.setTitle("Pomagaju - Administration");
        stage.setScene(registrationScene);
        stage.show();
    }

    @FXML
    protected void onRegistrierenButtonClick() throws IOException {
        Stage stage = (Stage) btnRegister.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PomagajuApplication.class.getResource("registration-view.fxml"));
        Scene registrationScene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Pomagaju - Registration");
        stage.setScene(registrationScene);
        stage.show();
    }
}

