/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;
import address.*;
import address.javaMailAPI;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Mahalwal's
 */
public class LoginOverviewController {
    
    static newUser newuser;
    static String salt;
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
    private JFXTextField username;
    @FXML
    private JFXPasswordField repassword;
    @FXML
    private JFXButton signUpButton;
    @FXML
    private ChoiceBox<String> typeOfUserSignUp;
    @FXML
    private JFXTextField fullname;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField password;

    @FXML
    private void initialize() throws IOException, ClassNotFoundException{
        storeRetrieveUserData storeRetrieveUserData1 = new storeRetrieveUserData();
        storeRetrieveUserData1.desearialize("newuser"); 
        
        for(newUser u: MainApp.getListOfUser())
        {
            System.out.println(u);
        }
        typeOfUser.setValue("Student");
        typeOfUser.setItems(typeOfUserList);
        typeOfUserSignUp.setValue("Student");
        typeOfUserSignUp.setItems(typeOfUserList);
    }
    public newUser getNewUser(){
        return newuser;
    }
    
    @FXML
    private void studPage(ActionEvent event)  throws IOException {
        String currentChoiceBoxValue = typeOfUser.getValue();
        String loginusername = loginUserName.getText();
        String loginpassword = loginPassword.getText();
        if(!validation1(loginusername, loginpassword, currentChoiceBoxValue))
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.setTitle("User Not found");
            stage.show();      
            return;
        }
        
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
    private void sendEmail(ActionEvent event)  throws IOException, InterruptedException, ClassNotFoundException {
        javaMailAPI mailAPI = new javaMailAPI();
        String to = "manish16054@iiitd.ac.in";
        String []toID = {to};
        salt = getSaltString();
        mailAPI.sendFromGMail(toID, "OTP for sign up", "Please use this OTP:\n"+salt);
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUpPopUpWindow.fxml"));
//        Parent root1 = (Parent) fxmlLoader.load();
//        Stage stage = new Stage();
//        stage.setScene(new Scene(root1)); 
//        stage.setResizable(false);
//        stage.setTitle("Verfiy OTP");
//        stage.show();
        
        String inpUserName = username.getText();
        String iFullName = fullname.getText();
        String iEmail = email.getText();
        String iPassword = password.getText();
        String iRePassword = repassword.getText();
        String iTypeOfUserSignUp = typeOfUserSignUp.getValue();
        System.out.println(inpUserName+" "+iFullName+" "+iTypeOfUserSignUp);
        if(validation(inpUserName, iFullName, iEmail, iPassword, iRePassword, iTypeOfUserSignUp)){
            
            newuser = new newUser(inpUserName, iFullName, iEmail, iPassword, iRePassword, iTypeOfUserSignUp);
            storeRetrieveUserData storeRetrieveUserData1 = new storeRetrieveUserData();
            MainApp.getListOfUser().add(newuser);
            storeRetrieveUserData1.serialize("newuser");

//            System.out.println("yaaaah");
            for(newUser u: MainApp.getListOfUser())
            {
//                System.out.println("it came here");
                System.out.println(u);
            }
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signUpPopUpWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.setTitle("Verfiy OTP");
            stage.show();
        }
    }
    public boolean validation(String username, String fullname, String email, String password, String repassword, String type) throws IOException
    {
        if(username.trim().isEmpty() || fullname.trim().isEmpty() || password.trim().isEmpty() || repassword.trim().isEmpty() || email.trim().isEmpty() || type.trim().isEmpty()){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.setTitle("Missing fields");
            stage.show();
            return false;
        }
        System.out.println("all fields");
        return true;
    }
    public boolean validation1(String username1, String password1, String type1) throws IOException
    {
        if(username1.trim().isEmpty() || password1.trim().isEmpty()){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.setTitle("Missing fields");
            stage.show();
            return false;
        }
        else{
            for(newUser u: MainApp.listOfUser){
                if(u.username.equals(username1) && u.password.equals(password1) && u.type.equals(type1)){
                    System.out.println("found");
                    return true;
                }
            }
        }
        return false;
    }
    
    public String getSaltString() 
    {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}

