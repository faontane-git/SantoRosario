/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santorosarioControladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import santorosarioControladores.Manejadores.Manejador;

/**
 * FXML Controller class
 *
 * @author Fabrizzio Ontaneda
 */
public class FXMLMisterioController implements Initializable {

    @FXML
    static private Label txtTitulo;

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
    
}
