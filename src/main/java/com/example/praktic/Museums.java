package com.example.praktic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Museums {
    @FXML
    private Button Back;
    @FXML
    ImageView Hold;
    @FXML
    ImageView Odna;
    @FXML
    ImageView Savi;
    @FXML
    ImageView Litra;
    @FXML ImageView Kraev;
    @FXML ImageView Kluch;
    public void hold(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Hold.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("hold.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void litra(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Litra.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("litra.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void savi(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Savi.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("savi.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void odna(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Odna.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("odna.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void kraev(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Kraev.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("kraev.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();

    }

    public void kluch(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Kluch.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("kluch.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stageCLose = (Stage) Back.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("Menu.fxml").openStream());
        Scene scene = new Scene(root, 752, 482);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }
}
