/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Page extends Application {
    

    @Override
    public void start(Stage Stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        Stage.setScene(scene);
        Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
