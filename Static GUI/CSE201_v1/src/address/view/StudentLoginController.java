/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.view;

import address.*;
import address.RequestRoomFromAdmin;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Mahalwal's
 */
public class StudentLoginController implements Initializable {
    @FXML
    private AnchorPane StudentLoginRootPane;
    @FXML
    private TableView<Course> timeTableTable;
    @FXML
    TableColumn<Course, String> courseName;
    @FXML
    TableColumn<Course, String> instructor;
    @FXML
    TableColumn<Course, String> code;
    @FXML
    TableColumn<Course, String> tut;
    @FXML
    private TableColumn<Course, String> monday;
    @FXML
    private TableColumn<Course, String> tuesday;
    @FXML
    private TableColumn<Course, String> wednesday;
    @FXML
    private TableColumn<Course, String> thursday;
    @FXML
    private TableColumn<Course, String> friday;
    @FXML
    private TableColumn<Course, String> lab;
    @FXML
    private TextField BookRoom_RoomNumber_StudentLogin;
    @FXML
    private TextField BookRoom_DesiredCapacity_StudentLogin1;
    @FXML
    private TextField BookRoom_DesiredCapacity_StudentLogin;
    @FXML
    private TextField BookRoom_StartTime_StudentLogin;
    @FXML
    private TextField BookRoom_EndTime_StudentLogin;
    @FXML
    private Button BookRoom_BookButton_StudentLogin;
    @FXML
    private TextArea BookRoom_Purpose_StudentLogin;
    
    
//    ObservableList<String> tableData = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        courseName.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
        instructor.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor"));
        code.setCellValueFactory(new PropertyValueFactory<Course, String>("code"));
        monday.setCellValueFactory(new PropertyValueFactory<Course, String>("monday"));
        tuesday.setCellValueFactory(new PropertyValueFactory<Course, String>("tuesday"));
        wednesday.setCellValueFactory(new PropertyValueFactory<Course, String>("wednesday"));
        thursday.setCellValueFactory(new PropertyValueFactory<Course, String>("thursday"));
        friday.setCellValueFactory(new PropertyValueFactory<Course, String>("friday"));
        lab.setCellValueFactory(new PropertyValueFactory<Course, String>("lab"));
        tut.setCellValueFactory(new PropertyValueFactory<Course, String>("tut"));
        
        timeTableTable.setItems(getCourses());
    }
    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {
        AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginOverview.fxml"));
        StudentLoginRootPane.getChildren().setAll(pane);
    }

    private ObservableList<Course> getCourses() {
        
        ObservableList<Course> tableData = FXCollections.observableArrayList();
        tableData.add(new Course("Mandatory"	,"Discrete \nMathematics"	,"CSE121",	"Dhongoon \nChang"	,"4"	,"DM"	, "",	"1:30-3:00 \nC21"	,	"",	"", "11:30-1:00 \nC21"	,"Wednesday  \n4:00-5:30 \nS01\nFriday  \n4:00-5:30 \nLR1;LR2;LR3",	"",	"A good knowledge of elementary mathematics, esp. algebra, calculus and basic programming language."," Be able to read, interpret and write some basic mathematical notation. be able to recognize and/or construct examples of mathematical objects introduced during the course, such as the sets and functions. have been introduced to several mathematical models, (e.g. propositional logic, trees) including some of those underlying computing and information technologyhave had the opportunity to develop capacity in knowing what constitutes a valid argument, and in constructing valid arguments/proofshave had an opportunity to develop the problem-solving skills"));
        tableData.add(new Course("Mandatory",	"Advanced \nProgramming",	"CSE201",	"Vivek \nKumar",	"4",	"AP",	"11:00-12:00 \nC21"	, "",	"11:00-12:00 \nC21",	"11:00-12:00 \nC21",	"", "Monday   \n12:00-1:00 \nLR1;LR2;S01;S02" ,	"Thursday :  \n12:00-1:00 \nL21;L22;L23",	"Introduction to Programming (CSE101)Data Structures & Algorithms (CSE102)",	"Students are able to demonstrate the knowledge of basic principles of Object Oriented Programming such as encapsulation (classes and objects), interfaces, polymorphism and inheritance; by implementing programs ranging over few hundreds lines of code.Implement basic event driven programming, exception handling, and threading. Students are able to analyze the problem in terms of use cases and create object oriented design for it. Students are able to present the design in UML.Students are able to select and use a few key design pattern to solve a given problem in hand.Students are able to use common tools for testing (e.g., JUnit), debugging, and source code control as an integral part of program development."));
        tableData.add(new Course("Mandatory",	"Computer \nOrganization"	,"CSE112",	"Naveen \nPrakash" ,	"4",	"CO"	,	"",  "",	"2:30-4:00 \nC21",	"4:00-5:30 \nC01"	, "",	"Wednesday   \n1:30-2:30 \nLR2;LR3;C22;C23"	, "",	"Introduction to Programming (CSE101)Digital Circuits(CSE111)",	"Write program in assembly language(RISC ISA) - Compare performance between several implementations of a computer program.Analyse processor performance for different implementation strategies : eg. single vs. multicycle,pipelined vs. non-pipelined execution.Simulate and compare performance of cache memory,compare caches with different configuration.Analyse basic I/O operation and their performance."));
        tableData.add(new Course("Elective"	,"Math-III"	,"MTH203"	,"Sarthok \nSircar",	"4",	"M-III"	,	"", "3:00-4:00 \nC21", "", "3:00-4:00 \nC21",	"3:00-4:00 \nC21",	"Monday  \n8:30-10:00 \nLR1 \n1:30-3:00 \nLR1" , "", "", "Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals).Students are able to work with vector fields, evaluate lineand surface integrals, calculate quantities such as work,circulation and flux across plane curves and surfaces, be able to carry out vector derivative operations such as gradient, divergence and curl and understand and apply Green's, Stoke's and divergenceÂ Â theorems.Students are able to evaluatederivatives and integrals of complex functions, including the applications of Cauchy's theorem.Students are able to determine convergence of complex series and power series and understand and apply Taylor series to represent complexfunctions."));
        tableData.add(new Course("Elective", "Signal and \nSystems"	,"ECE250"	,"Anubha \nGupta",	"4"	,"S&S"	,"",	"11:00-12:00 \nC21"	,	"", "2:00-3:00 \nC21",	"2:00-3:00 \nC21"	,"Monday   \n2:00-3:00 \nLR3" ,	 "",	"MTH100 Maths I"	,"Students are able to classify basic signal representation; continuous time and discrete-time signalsStudents are able to determine the response of an LTI system to continuous-time or discrete-time input signals.Students are able to represent both continuous-time and discrete-time periodic signals as Fourier series. Students are able to analyze continuous-time signals and systems using Fourier transform and Laplace transform.Students are able to analyze discrete-time signals and systems using discrete-time Fourier transform and Z-transform."));

        return tableData;
    }
    
    @FXML
    private void onClickRequestRoomButtonFromStudent(ActionEvent event) {
        RequestRoomFromAdmin fromStudent;
        String roomNumber = BookRoom_RoomNumber_StudentLogin.getText();
//        String
        int desiredCapacity = Integer.parseInt(BookRoom_DesiredCapacity_StudentLogin.getText());
        String startTime = BookRoom_StartTime_StudentLogin.getText();
        String endTime = BookRoom_EndTime_StudentLogin.getText();
//        boolean book;
        String purpose = BookRoom_Purpose_StudentLogin.getText();
        fromStudent= new RequestRoomFromAdmin(roomNumber, desiredCapacity, startTime, endTime, purpose);
//        if(book){
        newUser n1= new Student(null,null,null,"","","","","","");
        Student thisStudent = (Student)n1;
        thisStudent.getCurrentRequestOfRoomBooking().add(fromStudent);
//            return "Booking request made Successfully";
//        }
//        else{
//            if(onClickCancelPendingRequestFromStudent(fromStudent)){
//                return "Cancelling Successful";
//            }
//            else{
//                return "Cancelling Failed";
//            }
    }
}

