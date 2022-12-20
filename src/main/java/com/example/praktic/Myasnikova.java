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

public class Myasnikova {
    @FXML
    private Button Back;
    public void map(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.032312%2C53.185554&mode=poi&poi%5Bpoint%5D=45.016227%2C53.183534&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D1118909815&z=12.92";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void site(ActionEvent actionEvent) {
        try {
            String url = "http://penza.gallery/o-muzee/filialy/muzej-odnoj-kartiny.html?ysclid=lbuqb5248h836566581";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void phone(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "56-14-27");
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
