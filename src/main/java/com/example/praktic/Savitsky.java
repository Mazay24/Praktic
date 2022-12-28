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

public class Savitsky {
    @FXML
    private Button Back;

    public void map(ActionEvent actionEvent) {//Переход на сайт ЯндексКарты
        try {
            String url = "https://yandex.ru/maps/org/gbuk_penzenskaya_oblastnaya_kartinnaya_galereya_imeni_k_a_savitskogo/1257314738/?ll=45.035242%2C53.186942&z=12.52";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void site(ActionEvent actionEvent) {//Открытие сайта
        try {
            String url = "https://www.tourister.ru/world/europe/russia/city/penza/artgallery/35465";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void phone(ActionEvent actionEvent) {//Показ телефона
        JOptionPane.showMessageDialog(null, "56-43-15");
    }

    public void back(ActionEvent actionEvent) throws IOException {//Возврат в предыдущее окно
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
