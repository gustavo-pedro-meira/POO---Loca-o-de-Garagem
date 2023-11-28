/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package locacaodegaragem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author gusta
 */
public class FXMLRegistrarVeiculoController1 implements Initializable {

    @FXML
    private ChoiceBox<String> cbTipoVeiculo;
    private String[] veiculos = {"Carro","Moto","Caminhão","Bicicleta"};
    @FXML
    private Button btnRegistrar;
    @FXML
    private Label labelRegistrado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbTipoVeiculo.getItems().addAll(veiculos);
    }    
    
    public void labelRegistrar(){
        labelRegistrado.setText("Veiculo Registrado!");
    }
    
}
