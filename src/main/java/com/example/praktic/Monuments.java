package com.example.praktic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.awt.*;
import java.io.IOException;

public class Monuments{
    @FXML private ImageView First;
    @FXML
    private Button Back;
    @FXML private ImageView Yuvelir;
    @FXML private ImageView Memor;
    @FXML private ImageView Belinsk;
    @FXML private ImageView Globus;
    @FXML private ImageView Rostok;

    public void first(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) First.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("First.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void yuvelir(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Yuvelir.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("yuvelir.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void memor(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Memor.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("memor.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void belinsk(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Belinsk.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("belinsk.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void globus(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Globus.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("globus.fxml").openStream());
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void rostok(MouseEvent mouseEvent) throws IOException {
        Stage stageCLose = (Stage) Rostok.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("rostok.fxml").openStream());
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
