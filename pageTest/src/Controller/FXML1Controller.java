package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import View.convert;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXML1Controller implements Initializable {

    @FXML
    private Button logoutbtn;
    @FXML
    private TextField usdtextfield;
    @FXML
    private TextField nistextfield;
    
    
   
    private final double USD_TO_ILS = 3.29;

    private final double ILS_TO_USD = 0.30;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logoutbtn(ActionEvent event) throws IOException {
      
View.ViewManager1.closeAdminPage();
    }

    @FXML
    private void btton(ActionEvent event) {

        if (usdtextfield.getText().isEmpty() && !nistextfield.getText().isEmpty()) {
            // convert ILS to USD
            double ils = Double.parseDouble(nistextfield.getText());
            double usd = ils * ILS_TO_USD;
            usdtextfield.setText(String.format("%.2f", usd));
        } else if (!usdtextfield.getText().isEmpty() && nistextfield.getText().isEmpty()) {
            // convert USD to ILS
            double usd = Double.parseDouble(usdtextfield.getText());
            double ils = usd * USD_TO_ILS;
            nistextfield.setText(String.format("%.2f", ils));
        } else {
            // invalid input
            System.out.println("Invalid input.");
        }
    }

}
