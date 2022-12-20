package com.example.praktic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @FXML
    Button Exit;
    @FXML Button Monuments;
    @FXML Button Museum;
    @Override
    public void start(Stage stage) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 752, 482);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }



    

    public void museum(ActionEvent actionEvent) throws IOException {
        Stage stageCLose = (Stage) Museum.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("Museums.fxml").openStream());
        Scene scene = new Scene(root, 702, 502);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void monuments(ActionEvent actionEvent) throws IOException {
        Stage stageCLose = (Stage) Monuments.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("Mono.fxml").openStream());
        Scene scene = new Scene(root, 702, 502);
        stage.setTitle("Памятные места Пензы");
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) {
        int check = JOptionPane.showConfirmDialog(null, "Выйти из приложения", "Message", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}