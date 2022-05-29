package com.example.nutritionapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    public TextField sreya;
    @FXML
    public TextField email;
    @FXML
    public TextField delivery;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void buttonon() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("keto.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon1() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("detox.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon2() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("intermittent.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon3() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("liquid.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon4() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vegan diet.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon5() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calorie.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon6() throws IOException {
        String sreya1 = sreya.getText();
        String email1 = email.getText();
        String delivery1 = delivery.getText();

    }

    @FXML
    public void buttonon7() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("userinput.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void buttonon8() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yesno.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void buttonon9() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yesno.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 620);
        Stage stage = new Stage();
        stage.setTitle("Emergency!");
        stage.setScene(scene);
        stage.show();

    }

}
