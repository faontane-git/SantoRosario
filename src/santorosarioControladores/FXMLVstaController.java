/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorosarioControladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Fabrizzio Ontaneda
 */
public class FXMLVstaController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button btnIniciar;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnCreditos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void clickiniciar(ActionEvent event) {
    }

    @FXML
    private void clickSalir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void clickCreditos(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLCreditos.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
