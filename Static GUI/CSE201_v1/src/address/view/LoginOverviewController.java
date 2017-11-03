/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Mahalwal's
 */
public class LoginOverviewController {
    
    ObservableList<String> typeOfUserList = FXCollections.observableArrayList("Student","Faculty","Admin");
    @FXML
    private AnchorPane loginRootPane;


//    @FXML
//    private void initialize(){
//        typeOfUser.setValue("Student");
//        signUpTypeOfUser.setValue("Student");
//        typeOfUser.setItems(typeOfUserList);
//        signUpTypeOfUser.setItems(typeOfUserList);
//    }

//    @FXML
//    private void switchToStudentPage(ActionEvent event) throws IOException {
//        AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("StudentLogin.fxml"));
//        loginRootPane.getChildren().setAll(pane);
//    }

    @FXML
    private void studPage(ActionEvent event)  throws IOException {
        AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("StudentLogin.fxml"));
        loginRootPane.getChildren().setAll(pane);
    }
}
