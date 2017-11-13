/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mahalwal's
 */
public class SignUpPopUpWindowController implements Initializable {

    @FXML
    private JFXTextField otpfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void checkOTP(ActionEvent event) throws IOException {
        String enteredOTP = otpfield.getText();
        if(LoginOverviewController.salt.equals(enteredOTP))
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUpPopUpWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.setTitle("Registered! Please login again");
            stage.show();
        }
        else{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUpPopUpWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.setTitle("Wrong OTP");
            stage.show();
        }
    }
}
