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
 * FXML Controller class
 *
 * @author Fabrizzio Ontaneda
 */
public class FXMLMisterioController implements Initializable {

    @FXML
    static private Label txtTitulo;
    @FXML
    private Button bntMisterioHoy;
    @FXML
    private Button btnOtroMisterio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public FXMLMisterioController() {

    }

//    public void establecerMisterio(){
//        if(Manejador.getDayOfTheWeek()==1 || Manejador.getDayOfTheWeek()==4){
//            txtTitulo.setText("Hoy tocan los Misterios Gloriosos");
//        }else if(Manejador.getDayOfTheWeek()==2 || Manejador.getDayOfTheWeek()==7){
//            txtTitulo.setText("Hoy tocan los Misterios Gozosos");
//        }else if(Manejador.getDayOfTheWeek()==3 || Manejador.getDayOfTheWeek()==6){
//            txtTitulo.setText("Hoy tocan los Misterios Dolorosos");
//        }else if(Manejador.getDayOfTheWeek()==5){
//            txtTitulo.setText("Hoy tocan los Misterios Luminosos");
//        }
//    }
    @FXML
    private void clickMisterioHoy(ActionEvent event) {
    }

    @FXML
    private void clickOtroMisterio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLOtroMisterio.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
