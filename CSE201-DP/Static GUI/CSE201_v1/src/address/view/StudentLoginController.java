/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mahalwal's
 */
public class StudentLoginController implements Initializable {
    @FXML
    private AnchorPane StudentLoginRootPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {
        AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginOverview.fxml"));
        StudentLoginRootPane.getChildren().setAll(pane);
    }   
}