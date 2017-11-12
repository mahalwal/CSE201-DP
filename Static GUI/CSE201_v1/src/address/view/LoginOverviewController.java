/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;
import address.javaMailAPI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Mahalwal's
 */
public class LoginOverviewController {
    
    ObservableList<String> typeOfUserList = FXCollections.observableArrayList("Student","Faculty","Admin");
    @FXML
    private AnchorPane loginRootPane;
    @FXML
    private JFXButton loginButton;
    @FXML
    private JFXPasswordField loginPassword;
    @FXML
    private JFXTextField loginUserName;
    @FXML
    private ChoiceBox<String> typeOfUser;
    @FXML
    private JFXPasswordField loginPassword1;
    @FXML
    private JFXTextField loginUserName1;
    @FXML
    private JFXPasswordField loginPassword11;
    @FXML
    private JFXTextField loginUserName11;
    @FXML
    private JFXTextField loginUserName111;
    @FXML
    private JFXButton signUpButton;
    @FXML
    private ChoiceBox<String> typeOfUserSignUp;

    @FXML
    private void initialize(){
        typeOfUser.setValue("Student");
        typeOfUser.setItems(typeOfUserList);
        typeOfUserSignUp.setValue("Student");
        typeOfUserSignUp.setItems(typeOfUserList);
    }
    
    @FXML
    private void studPage(ActionEvent event)  throws IOException {
        String currentChoiceBoxValue = typeOfUser.getValue();
        if(currentChoiceBoxValue.equals("Student"))
        {
            AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("StudentLogin.fxml"));
            loginRootPane.getChildren().setAll(pane);
        }
        else if(currentChoiceBoxValue.equals("Admin"))
        {
            AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
            loginRootPane.getChildren().setAll(pane);
        }
        else if(currentChoiceBoxValue.equals("Faculty"))
        {
            AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("FacultyLogin.fxml"));
            loginRootPane.getChildren().setAll(pane);
        }
    }
    @FXML
    private void sendEmail(ActionEvent event)  throws IOException {
        javaMailAPI mailAPI = new javaMailAPI();
        String to = "manish16054@iiitd.ac.in";
        String []toID = {to};
//        mailAPI.sendFromGMail(toID, "MAIL from our APP", "Hello! version control kar le!!!!!!!");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUpPopUpWindow.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1)); 
        stage.show();
    }
}