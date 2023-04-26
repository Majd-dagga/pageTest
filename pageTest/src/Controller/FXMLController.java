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
import javafx.scene.control.TextField;
import View.ViewManager1;
import View.ViewManager1;
import View.convert;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField usernamefield;
    @FXML
    private TextField passwordfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginbtn(ActionEvent event) throws IOException {

        if (usernamefield.getText().equals("majd") && passwordfield.getText().equals("123")) {

//            new convert().show();
  ViewManager1.openAdminPage();

        } else {

            usernamefield.setText("is invalid");
            usernamefield.setStyle("-fx-text-fill:red;");
            usernamefield.setStyle("-Fx-border-color:red;");
            
            passwordfield.setText("is invalid");
            passwordfield.setStyle("-fx-text-fill:red;");
            passwordfield.setStyle("-Fx-border-color:red;");
        }

    }

}
