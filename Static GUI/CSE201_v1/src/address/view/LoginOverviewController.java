/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;

import address.MainApp;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mahalwal's
 */
public class LoginOverviewController {

    @FXML
    private JFXTextField loginUserName;
    @FXML
    private JFXPasswordField loginPassword;
    @FXML
    private JFXButton loginButton;
    @FXML
    private JFXButton signUpButton;

    @FXML
    private void makeLogin(ActionEvent event) {
        String user = loginUserName.getText();
        String pass = loginPassword.getText();
        if(user.equals("manish") && pass.equals("mahlu")){
            System.out.println("Homieee~~~~~===");
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/LoginOverview2.fxml"));
            try {
                AnchorPane personOverview = (AnchorPane) loader.load();
            } catch (IOException ex) {
                Logger.getLogger(LoginOverviewController.class.getName()).log(Level.SEVERE, null, ex);
            }
//            MainApp m = new MainApp();
//            m.rootLayout.setCenter(personOverview);
//            rootLayout
        }else{
            System.out.println("Nigga");
        }
    }
//    @FXML
//    private void loadSignUp(ActionEvent event){
//        
//    }
    
}
