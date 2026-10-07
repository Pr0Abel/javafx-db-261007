package com.example.javafxdb261007;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String dbHost = EnvLoader.get("DB_HOST", "localhost");
        String dbPort = EnvLoader.get("DB_PORT", "3306");
        String dbUsername = EnvLoader.get("DB_USERNAME", "root");
        String dbPassword = EnvLoader.get("DB_PASSWORD", "");
        String dbDatabesName = EnvLoader.get("DB_DATABES", "test");
    }
}