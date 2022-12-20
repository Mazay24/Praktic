package com.example.praktic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class InfoMonuments {
    @FXML
    private Button Back;

    public void first(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/org/pamyatnik_pervoposelenets/190235643912/?ll=44.951926%2C53.194019&z=13.15";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void yuvelir(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.022596%2C53.199826&mode=poi&poi%5Bpoint%5D=45.017290%2C53.196174&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D84797877791&source=entity_search&z=13.78";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void belinsk(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.013936%2C53.198132&mode=poi&poi%5Bpoint%5D=45.017176%2C53.198601&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D186916999091&z=12.52";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void globus(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.004048%2C53.204631&mode=poi&poi%5Bpoint%5D=44.978745%2C53.205107&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D120496859131&z=13.15";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void rostok(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.033182%2C53.200438&mode=poi&poi%5Bpoint%5D=45.025348%2C53.195311&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D158323779313&z=12.41";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void message(ActionEvent actionEvent) {
        try {
            // file path to  open
            File u = new File("D:\\Java\\Praktic\\src\\main\\resources\\message.doc");

            Desktop d = Desktop.getDesktop();
            d.open(u);
        } catch (IOException eevt) {
            System.out.println(eevt.getMessage());
        }
    }

    public void memor(ActionEvent actionEvent) {
        try {
            String url = "https://yandex.ru/maps/49/penza/?ll=45.037032%2C53.205205&mode=poi&poi%5Bpoint%5D=44.988906%2C53.213346&poi%5Buri%5D=ymapsbm1%3A%2F%2Forg%3Foid%3D18989210571&z=12.52";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Stage stageCLose = (Stage) Back.getScene().getWindow();
        stageCLose.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Pane root = fxmlLoader.load(getClass().getResource("Mono.fxml").openStream());
        Scene scene = new Scene(root, 702, 502);
        stage.setScene(scene);
        stage.show();
    }
}





