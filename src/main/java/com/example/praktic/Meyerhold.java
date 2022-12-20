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

public class Meyerhold {
    @FXML
    private Button Back;

    public void map(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.007045%2C53.199067&mode=poi&poi%5Bpoint%5D=45.014576%2C53.194610&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D1055830396&source=entity_search&z=13.68";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void site(ActionEvent actionEvent) {
        try {
            String url = "https://dommeyerholda.ru/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void phone(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "56-22-88");

    }

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
}
