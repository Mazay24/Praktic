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

public class Klyuchevsky {
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
            String url = "https://yandex.ru/maps/org/dom_muzey_v_o_klyuchevskogo/1014456709/?ll=45.028170%2C53.188774&z=12.925";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void site(ActionEvent actionEvent) {
        try {
            String url = "http://km-penza.ru/nashi-muzei/muzej-v-o-klyuchevskogo/?ysclid=lbuwz64kjm345898751";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void phone(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "54-38-01");
    }
}
