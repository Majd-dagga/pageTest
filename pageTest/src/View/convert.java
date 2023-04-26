/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class convert extends Stage {

    public convert() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML1.fxml"));
        Parent parent = loader.load();
        Scene s = new Scene(parent);
        this.setScene(s);
      
    }
}
