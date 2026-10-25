package com.example.javafxdb261007;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    public TextField input_host;
    public Spinner number_port;
    public TextField input_username;
    public PasswordField input_password;
    public TextField input_database_name;
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

        input_host.setText(dbHost);
        input_username.setText(dbUsername);
        input_password.setText(dbPassword);
        input_database_name.setText(dbDatabesName);
    }

    public void handleConnect(ActionEvent actionEvent) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbcConnStr = String.format("jdbc:mysql://%s:%s@%s:%d/%s",
                input_username.getText(),
                input_password.getText(),
                input_host.getText(),
                3306,
                input_database_name.getText()
                );

        Connection conn = DriverManager.getConnection(jdbcConnStr, input_username.getText(), input_password.getText());
        System.out.println(conn);
    }
}