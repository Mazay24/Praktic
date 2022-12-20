package com.example.praktic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Localhistory {
    @FXML
    private Button Back;

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stageCLose = (Stage) Back.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("Museums.fxml").openStream());
        Scene scene = new Scene(root, 702, 502);
        stage.setScene(scene);
        stage.show();
    }

    public void map(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/org/penzenskiy_gosudarstvenny_krayevedcheskiy_muzey/1088776353/?ll=45.020036%2C53.187354&source=entity_search&z=13.65";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void site(ActionEvent actionEvent) {
        try {
            String url = "http://km-penza.ru/?ysclid=lbuv065w0998685885";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void phone(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "56-55-20");
    }
}
