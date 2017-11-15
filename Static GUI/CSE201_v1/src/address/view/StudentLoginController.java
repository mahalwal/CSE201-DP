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
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mahalwal's
 */
public class StudentLoginController implements Initializable {
    
    static ArrayList<Course> allCoursesArrayList = new ArrayList<Course>();
    static ArrayList<Course> allTempStudentCoursesArrayList = new ArrayList<Course>();
//    Collections.copy(allTempStudentCoursesArrayList, allCoursesArrayList);
    static ArrayList<Course> currentStudentCourses = new ArrayList<Course>();
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
    @FXML
    private TableView<Course> allCoursesTable;
    @FXML
    private TableColumn<Course, String> courseName1;
    @FXML
    private TableColumn<Course, String> code1;
    @FXML
    private TableColumn<Course, String> instructor1;
    @FXML
    private TableColumn<Course, String> monday1;
    @FXML
    private TableColumn<Course, String> tuesday1;
    @FXML
    private TableColumn<Course, String> wednesday1;
    @FXML
    private TableColumn<Course, String> thursday1;
    @FXML
    private TableColumn<Course, String> friday1;
    @FXML
    private TableColumn<Course, String> lab1;
    @FXML
    private TableColumn<Course, String> tut1;
    @FXML
    private TextField keywordInput;
    @FXML
    private Button searchKeywordButton;
    @FXML
    private TableView<Course> searchKeywordTable;
    @FXML
    private TableColumn<Course, String> courseName11;
    @FXML
    private TableColumn<Course, String> code11;
    @FXML
    private TableColumn<Course, String> instructor11;
    @FXML
    private TableColumn<Course, String> monday11;
    @FXML
    private TableColumn<Course, String> tuesday11;
    @FXML
    private TableColumn<Course, String> wednesday11;
    @FXML
    private TableColumn<Course, String> thursday11;
    @FXML
    private TableColumn<Course, String> friday11;
    @FXML
    private TableColumn<Course, String> lab11;
    @FXML
    private TableColumn<Course, String> tut11;
    @FXML
    private TextField allCoursesCourseCodeEnter;
    @FXML
    private TextField personalTimeTableRemoveCode;
    @FXML
    private TextField courseByPostConditionCode;
    
    
//    ObservableList<String> tableData = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        //Student Time table
        addCoursesInArrayList();
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
        
        //All courses table
        courseName1.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
        instructor1.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor"));
        code1.setCellValueFactory(new PropertyValueFactory<Course, String>("code"));
        monday1.setCellValueFactory(new PropertyValueFactory<Course, String>("monday"));
        tuesday1.setCellValueFactory(new PropertyValueFactory<Course, String>("tuesday"));
        wednesday1.setCellValueFactory(new PropertyValueFactory<Course, String>("wednesday"));
        thursday1.setCellValueFactory(new PropertyValueFactory<Course, String>("thursday"));
        friday1.setCellValueFactory(new PropertyValueFactory<Course, String>("friday"));
        lab1.setCellValueFactory(new PropertyValueFactory<Course, String>("lab"));
        tut1.setCellValueFactory(new PropertyValueFactory<Course, String>("tut"));  
        
        timeTableTable.setItems(getCourses());
        allCoursesTable.setItems(getCourses1());
    }
    public void addCoursesInArrayList(){
        allCoursesArrayList.add(new Course("Mandatory"	,"Discrete \nMathematics"	,"CSE121",	"Dhongoon \nChang"	,"4"	,"DM"	, "",	"1:30-3:00 \nC21"	,	"",	"", "11:30-1:00 \nC21"	,"Wednesday  \n4:00-5:30 \nS01\nFriday  \n4:00-5:30 \nLR1;LR2;LR3",	"",	"A good knowledge of elementary mathematics, esp. algebra, calculus and basic programming language."," Be able to read, interpret and write some basic mathematical notation. be able to recognize and/or construct examples of mathematical objects introduced during the course, such as the sets and functions. have been introduced to several mathematical models, (e.g. propositional logic, trees) including some of those underlying computing and information technologyhave had the opportunity to develop capacity in knowing what constitutes a valid argument, and in constructing valid arguments/proofshave had an opportunity to develop the problem-solving skills"));
        allCoursesArrayList.add(new Course("Mandatory",	"Advanced \nProgramming",	"CSE201",	"Vivek \nKumar",	"4",	"AP",	"11:00-12:00 \nC21"	, "",	"11:00-12:00 \nC21",	"11:00-12:00 \nC21",	"", "Monday   \n12:00-1:00 \nLR1;LR2;S01;S02" ,	"Thursday :  \n12:00-1:00 \nL21;L22;L23",	"Introduction to Programming (CSE101)Data Structures & Algorithms (CSE102)",	"Students are able to demonstrate the knowledge of basic principles of Object Oriented Programming such as encapsulation (classes and objects), interfaces, polymorphism and inheritance; by implementing programs ranging over few hundreds lines of code.Implement basic event driven programming, exception handling, and threading. Students are able to analyze the problem in terms of use cases and create object oriented design for it. Students are able to present the design in UML.Students are able to select and use a few key design pattern to solve a given problem in hand.Students are able to use common tools for testing (e.g., JUnit), debugging, and source code control as an integral part of program development."));
        allCoursesArrayList.add(new Course("Mandatory",	"Computer \nOrganization"	,"CSE112",	"Naveen \nPrakash" ,	"4",	"CO"	,	"",  "",	"2:30-4:00 \nC21",	"4:00-5:30 \nC01"	, "",	"Wednesday   \n1:30-2:30 \nLR2;LR3;C22;C23"	, "",	"Introduction to Programming (CSE101)Digital Circuits(CSE111)",	"Write program in assembly language(RISC ISA) - Compare performance between several implementations of a computer program.Analyse processor performance for different implementation strategies : eg. single vs. multicycle,pipelined vs. non-pipelined execution.Simulate and compare performance of cache memory,compare caches with different configuration.Analyse basic I/O operation and their performance."));
        allCoursesArrayList.add(new Course("Elective"	,"Math-III"	,"MTH203"	,"Sarthok \nSircar",	"4",	"M-III"	,	"", "3:00-4:00 \nC21", "", "3:00-4:00 \nC21",	"3:00-4:00 \nC21",	"Monday  \n8:30-10:00 \nLR1 \n1:30-3:00 \nLR1" , "", "", "Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals).Students are able to work with vector fields, evaluate lineand surface integrals, calculate quantities such as work,circulation and flux across plane curves and surfaces, be able to carry out vector derivative operations such as gradient, divergence and curl and understand and apply Green's, Stoke's and divergenceÂ Â theorems.Students are able to evaluatederivatives and integrals of complex functions, including the applications of Cauchy's theorem.Students are able to determine convergence of complex series and power series and understand and apply Taylor series to represent complexfunctions."));
        allCoursesArrayList.add(new Course("Elective", "Signal and \nSystems"	,"ECE250"	,"Anubha \nGupta",	"4"	,"S&S"	,"",	"11:00-12:00 \nC21"	,	"", "2:00-3:00 \nC21",	"2:00-3:00 \nC21"	,"Monday   \n2:00-3:00 \nLR3" ,	 "",	"MTH100 Maths I"	,"Students are able to classify basic signal representation; continuous time and discrete-time signalsStudents are able to determine the response of an LTI system to continuous-time or discrete-time input signals.Students are able to represent both continuous-time and discrete-time periodic signals as Fourier series. Students are able to analyze continuous-time signals and systems using Fourier transform and Laplace transform.Students are able to analyze discrete-time signals and systems using discrete-time Fourier transform and Z-transform."));
        allCoursesArrayList.add(new Course("Elective",	"Real Analysis I",	"MTH2xx",	"Samaresh Chatterjee",	"4",	"RA",	"3:00-4:00\nC02", "10:00-11:00\nC02", "",	"10:00-11:00\nC02", "",	"Monday \n1:30-3:00\nLR2", "", "", "Students are familiar with the real number system, can determine convergence-divergence of sequences and series, and are able to construct epsilon-delta proofs related to limits and continuity. Students are familiar with the concepts of differentiation and integration and are able to apply the methods of single-variable calculus. Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals"));
        allCoursesArrayList.add(new Course("Elective",	"Number \nTheory", "MTH2xx",	"Anuradha \nSharma",	"4",	"NT", "10:00-11:00\nC12", "",	"10:00-11:00\nC12", "",	"9:30-10:30\nC12", "Monday \n2:00-3:00\nC23:Friday \n10:30-11:30\nLR1" , "", "", "To be able to write down formal Mathematical proofs. To be able to describe properties of some special numbertheorectic functions and their growth rates. To be able to explain properties of numbers of some special forms. To be able to describe complete solutions of some special Diophanti ne equationsand to be able to explain insolvability of some special non-linear Diophantineequations.To be able to explain the proof of Lagranges four squares theorem.To be able to explain basic theory of partitions To be able to explain elementary results on distributions of prime numbers To be able to apply numbertheoretic techniques to simply computations."));
        allCoursesArrayList.add(new Course("HSS \nElective", "Perspectives \nof Knowledge", "HSS202",	"Raj \nAyyar", "4", "PoK", "4:00-5:30\nC24", "", "4:00-5:30\nC24", "", "", "", "","", "Identify the meta-issues concerning knowledge and critically reflect on them. Demonstrate awareness of the diversity of epistemic and sociology of knowledge traditions. Get acquainted with a set of specific arguments, methodologies, and approaches to questions regarding knowledge. Develop an awareness of themselves as knowledge producers in the information society."));
        allCoursesArrayList.add(new Course("HSS \nElective", "Introduction to \nPsychology",	"HSS204",	"Akshay \nKumar", "4", "Psy", "4:00-5:30\nC01", "", "4:00-5:30\nC01", "", "", "", "", "", "Students would have learnt about concepts of General Psychology. Students would learn about basics of how people think, feel and behave. Students would learn the history and schools of Psychology.  Students would be taught how to practice Mindfulness and would be able to practice it by their own.  Students would get to learn basics concepts of therapies and some practical skills of how to practice them.  Student would be able to practice the concepts of Cognitive behavior Therapy and be able to practically study their own thoughts and manage them."));
        allCoursesArrayList.add(new Course("HSS \nElective", "Theory & Practice of \nEngineering Ethics",	"HSS208", "Raj\nAyyar", "4" ,"TPEE" , "", "4:00-5:30\nC22", "","", "4:00-5:30\nC22", "", "", "", "Demonstrate a clear understanding of meta-ethical theories. Apply meta-ethical theories to engineering and IT scenarios. Develop a finessed multi-perspectival understanding of moral issues. Evaluate moral statements and practices clearly and critically."));
        allCoursesArrayList.add(new Course("HSS \nElective", "Theatre \nAppreciation", "HSS211", "Manohar \nKhushlani", "4", "TA",	"4:00-5:30\nC12", "", "4:00-5:30\nC12", "", "", "", "", "", "Student have Knowledge of Biographies and Techniques proposed by Theatre Masters Students have ability to Overcome inhibitions in communication Students have ability to put up a mime show Students have some ability to perform a play"));
        allCoursesArrayList.add(new Course("HSS \nElective", "Key Concepts in \nEconomic Sociology",	"HSS2ES",	"Amrit \nSrinivasan",	"4", "ES",	"", "4:00-5:30\nC24", "", "", "4:00-5:30\nC24", "", "", "", "Economic Sociology on the other hand encourages students to see rational self-interest and action as embedded in society, influenced by group dynamics, legal institutions, power, organizations and even culture. It justifies the application of independent sociological methods and concepts to the examination and understanding of the Economy as a sphere of production, consumption and exchange of goods and services, which is observable in all human societies, not only the modern and advanced. It thereby encourages students to relate economic actions to all other forms of social actions observable in society â€“ the religious, the familial, the technological and the political. In sum, Economic sociology identifies the obligatory, symbolic and power seeking motivations underlying human economic action, not only the useful or utilitarian"));
        allCoursesArrayList.add(new Course("HSS \nElective",	"Introduction to \nDigital Ethonography",	"HSS2xx", "Shriram \nVenkatraman", "4", "IDE", "4:00-5:3\n\nC11", "", "4:00-5:30\nC11", "", "", "", "", "", "This course is intended to be an introductory course and will systematically introduce learners to the basics of Digital Ethnography. The course will first introduce learners to the fundamentals of Ethnography as a research method and will then help facilitate its application to the Digital world."));
        allCoursesArrayList.add(new Course("HSS \nElective",	"Introduction to \nMedia in Society : \nA Public Sphere \nApproach",	"HSS2xx", "Aasim \nKhan", "4", "IMS", "", "4:00-5:30\nC03", "", "", "4:00-5:30\nC03", "", "", "", "This course is intended to be an introductory course and will systematically introduce learners to the basics of Digital Ethnography. The course will first introduce learners to the fundamentals of Ethnography as a research method and will then help facilitate its application to the Digital world."));
        allCoursesArrayList.add(new Course("HSS \nElective",	"Introduction to \nSocial Informatics",	"HSS2xx", "Venkata \nRatandeep \nSuri", "4", "ISI", "", "4:00-5:30\nC13", "", "", "4:00-5:30\nC13", "", "", "", "Social informatics is an interdisciplinary field of research dedicated to studying the design, use and effects of information technologies. Social informatics seeks to understand how social contexts shape the form and character of technology. Likewise it also studies how technology influences power relationships and restructures social and organizational networks. In this course we will be developing our understanding of these issues by engaging critically with various controversial topics relating to information and communication technologies. This course urges students to go beyond the â€œmerely technicalâ€ aspects of ICTs and consider the social relations that are an integral part of designing and adopting a technology or a technological system. It also challenges students to think critically about technological change and acquire a more sophisticated understanding of the process."));
        allCoursesArrayList.add(new Course("HSS \nElective",    "Introduction to \nPoetry", "HSS223A", "Saumya \nKulshreshtha", "4", "PO", "", "4:30-6:00\nC02" , "", "", "", "", "", "", "Major schools of poetry post 19th century. Major English language poets from the British and American canon, post romantic era. Evolution of English poetry in India, along with famous poets. Figures of speech and different forms of poetry."));
    }
    @FXML
    private void switchToLoginPage(ActionEvent event) throws IOException {
        AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginOverview.fxml"));
        StudentLoginRootPane.getChildren().setAll(pane);
    }

    private ObservableList<Course> getCourses() {
        
        ObservableList<Course> tableData = FXCollections.observableArrayList();
        
        for(Course c: currentStudentCourses){
            tableData.add(c);
        }
//        tableData.add(new Course("Mandatory"	,"Discrete \nMathematics"	,"CSE121",	"Dhongoon \nChang"	,"4"	,"DM"	, "",	"1:30-3:00 \nC21"	,	"",	"", "11:30-1:00 \nC21"	,"Wednesday  \n4:00-5:30 \nS01\nFriday  \n4:00-5:30 \nLR1;LR2;LR3",	"",	"A good knowledge of elementary mathematics, esp. algebra, calculus and basic programming language."," Be able to read, interpret and write some basic mathematical notation. be able to recognize and/or construct examples of mathematical objects introduced during the course, such as the sets and functions. have been introduced to several mathematical models, (e.g. propositional logic, trees) including some of those underlying computing and information technologyhave had the opportunity to develop capacity in knowing what constitutes a valid argument, and in constructing valid arguments/proofshave had an opportunity to develop the problem-solving skills"));
//        tableData.add(new Course("Mandatory",	"Advanced \nProgramming",	"CSE201",	"Vivek \nKumar",	"4",	"AP",	"11:00-12:00 \nC21"	, "",	"11:00-12:00 \nC21",	"11:00-12:00 \nC21",	"", "Monday   \n12:00-1:00 \nLR1;LR2;S01;S02" ,	"Thursday :  \n12:00-1:00 \nL21;L22;L23",	"Introduction to Programming (CSE101)Data Structures & Algorithms (CSE102)",	"Students are able to demonstrate the knowledge of basic principles of Object Oriented Programming such as encapsulation (classes and objects), interfaces, polymorphism and inheritance; by implementing programs ranging over few hundreds lines of code.Implement basic event driven programming, exception handling, and threading. Students are able to analyze the problem in terms of use cases and create object oriented design for it. Students are able to present the design in UML.Students are able to select and use a few key design pattern to solve a given problem in hand.Students are able to use common tools for testing (e.g., JUnit), debugging, and source code control as an integral part of program development."));
//        tableData.add(new Course("Mandatory",	"Computer \nOrganization"	,"CSE112",	"Naveen \nPrakash" ,	"4",	"CO"	,	"",  "",	"2:30-4:00 \nC21",	"4:00-5:30 \nC01"	, "",	"Wednesday   \n1:30-2:30 \nLR2;LR3;C22;C23"	, "",	"Introduction to Programming (CSE101)Digital Circuits(CSE111)",	"Write program in assembly language(RISC ISA) - Compare performance between several implementations of a computer program.Analyse processor performance for different implementation strategies : eg. single vs. multicycle,pipelined vs. non-pipelined execution.Simulate and compare performance of cache memory,compare caches with different configuration.Analyse basic I/O operation and their performance."));
//        tableData.add(new Course("Elective"	,"Math-III"	,"MTH203"	,"Sarthok \nSircar",	"4",	"M-III"	,	"", "3:00-4:00 \nC21", "", "3:00-4:00 \nC21",	"3:00-4:00 \nC21",	"Monday  \n8:30-10:00 \nLR1 \n1:30-3:00 \nLR1" , "", "", "Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals).Students are able to work with vector fields, evaluate lineand surface integrals, calculate quantities such as work,circulation and flux across plane curves and surfaces, be able to carry out vector derivative operations such as gradient, divergence and curl and understand and apply Green's, Stoke's and divergenceÂ Â theorems.Students are able to evaluatederivatives and integrals of complex functions, including the applications of Cauchy's theorem.Students are able to determine convergence of complex series and power series and understand and apply Taylor series to represent complexfunctions."));
//        tableData.add(new Course("Elective", "Signal and \nSystems"	,"ECE250"	,"Anubha \nGupta",	"4"	,"S&S"	,"",	"11:00-12:00 \nC21"	,	"", "2:00-3:00 \nC21",	"2:00-3:00 \nC21"	,"Monday   \n2:00-3:00 \nLR3" ,	 "",	"MTH100 Maths I"	,"Students are able to classify basic signal representation; continuous time and discrete-time signalsStudents are able to determine the response of an LTI system to continuous-time or discrete-time input signals.Students are able to represent both continuous-time and discrete-time periodic signals as Fourier series. Students are able to analyze continuous-time signals and systems using Fourier transform and Laplace transform.Students are able to analyze discrete-time signals and systems using discrete-time Fourier transform and Z-transform."));
        
        return tableData;
    }
    
    private ObservableList<Course> getCourses1() {
        
        ObservableList<Course> tableData = FXCollections.observableArrayList();
        tableData.add(new Course("Mandatory"	,"Discrete \nMathematics"	,"CSE121",	"Dhongoon \nChang"	,"4"	,"DM"	, "",	"1:30-3:00 \nC21"	,	"",	"", "11:30-1:00 \nC21"	,"Wednesday  \n4:00-5:30 \nS01\nFriday  \n4:00-5:30 \nLR1;LR2;LR3",	"",	"A good knowledge of elementary mathematics, esp. algebra, calculus and basic programming language."," Be able to read, interpret and write some basic mathematical notation. be able to recognize and/or construct examples of mathematical objects introduced during the course, such as the sets and functions. have been introduced to several mathematical models, (e.g. propositional logic, trees) including some of those underlying computing and information technologyhave had the opportunity to develop capacity in knowing what constitutes a valid argument, and in constructing valid arguments/proofshave had an opportunity to develop the problem-solving skills"));
        tableData.add(new Course("Mandatory",	"Advanced \nProgramming",	"CSE201",	"Vivek \nKumar",	"4",	"AP",	"11:00-12:00 \nC21"	, "",	"11:00-12:00 \nC21",	"11:00-12:00 \nC21",	"", "Monday   \n12:00-1:00 \nLR1;LR2;S01;S02" ,	"Thursday :  \n12:00-1:00 \nL21;L22;L23",	"Introduction to Programming (CSE101)Data Structures & Algorithms (CSE102)",	"Students are able to demonstrate the knowledge of basic principles of Object Oriented Programming such as encapsulation (classes and objects), interfaces, polymorphism and inheritance; by implementing programs ranging over few hundreds lines of code.Implement basic event driven programming, exception handling, and threading. Students are able to analyze the problem in terms of use cases and create object oriented design for it. Students are able to present the design in UML.Students are able to select and use a few key design pattern to solve a given problem in hand.Students are able to use common tools for testing (e.g., JUnit), debugging, and source code control as an integral part of program development."));
        tableData.add(new Course("Mandatory",	"Computer \nOrganization"	,"CSE112",	"Naveen \nPrakash" ,	"4",	"CO"	,	"",  "",	"2:30-4:00 \nC21",	"4:00-5:30 \nC01"	, "",	"Wednesday   \n1:30-2:30 \nLR2;LR3;C22;C23"	, "",	"Introduction to Programming (CSE101)Digital Circuits(CSE111)",	"Write program in assembly language(RISC ISA) - Compare performance between several implementations of a computer program.Analyse processor performance for different implementation strategies : eg. single vs. multicycle,pipelined vs. non-pipelined execution.Simulate and compare performance of cache memory,compare caches with different configuration.Analyse basic I/O operation and their performance."));
        tableData.add(new Course("Elective"	,"Math-III"	,"MTH203"	,"Sarthok \nSircar",	"4",	"M-III"	,	"", "3:00-4:00 \nC21", "", "3:00-4:00 \nC21",	"3:00-4:00 \nC21",	"Monday  \n8:30-10:00 \nLR1 \n1:30-3:00 \nLR1" , "", "", "Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals).Students are able to work with vector fields, evaluate lineand surface integrals, calculate quantities such as work,circulation and flux across plane curves and surfaces, be able to carry out vector derivative operations such as gradient, divergence and curl and understand and apply Green's, Stoke's and divergenceÂ Â theorems.Students are able to evaluatederivatives and integrals of complex functions, including the applications of Cauchy's theorem.Students are able to determine convergence of complex series and power series and understand and apply Taylor series to represent complexfunctions."));
        tableData.add(new Course("Elective", "Signal and \nSystems"	,"ECE250"	,"Anubha \nGupta",	"4"	,"S&S"	,"",	"11:00-12:00 \nC21"	,	"", "2:00-3:00 \nC21",	"2:00-3:00 \nC21"	,"Monday   \n2:00-3:00 \nLR3" ,	 "",	"MTH100 Maths I"	,"Students are able to classify basic signal representation; continuous time and discrete-time signalsStudents are able to determine the response of an LTI system to continuous-time or discrete-time input signals.Students are able to represent both continuous-time and discrete-time periodic signals as Fourier series. Students are able to analyze continuous-time signals and systems using Fourier transform and Laplace transform.Students are able to analyze discrete-time signals and systems using discrete-time Fourier transform and Z-transform."));
        tableData.add(new Course("Elective",	"Real Analysis I",	"MTH2xx",	"Samaresh Chatterjee",	"4",	"RA",	"3:00-4:00\nC02", "10:00-11:00\nC02", "",	"10:00-11:00\nC02", "",	"Monday \n1:30-3:00\nLR2", "", "", "Students are familiar with the real number system, can determine convergence-divergence of sequences and series, and are able to construct epsilon-delta proofs related to limits and continuity. Students are familiar with the concepts of differentiation and integration and are able to apply the methods of single-variable calculus. Students are able to apply concepts of continuity, differentiability, extrema and integrability of multivariable functions and evaluate various integrals (line, double, triple and surface integrals"));
        tableData.add(new Course("Elective",	"Number \nTheory", "MTH2xx",	"Anuradha \nSharma",	"4",	"NT", "10:00-11:00\nC12", "",	"10:00-11:00\nC12", "",	"9:30-10:30\nC12", "Monday \n2:00-3:00\nC23:Friday \n10:30-11:30\nLR1" , "", "", "To be able to write down formal Mathematical proofs. To be able to describe properties of some special numbertheorectic functions and their growth rates. To be able to explain properties of numbers of some special forms. To be able to describe complete solutions of some special Diophanti ne equationsand to be able to explain insolvability of some special non-linear Diophantineequations.To be able to explain the proof of Lagranges four squares theorem.To be able to explain basic theory of partitions To be able to explain elementary results on distributions of prime numbers To be able to apply numbertheoretic techniques to simply computations."));
        tableData.add(new Course("HSS \nElective", "Perspectives \nof Knowledge", "HSS202",	"Raj \nAyyar", "4", "PoK", "4:00-5:30\nC24", "", "4:00-5:30\nC24", "", "", "", "","", "Identify the meta-issues concerning knowledge and critically reflect on them. Demonstrate awareness of the diversity of epistemic and sociology of knowledge traditions. Get acquainted with a set of specific arguments, methodologies, and approaches to questions regarding knowledge. Develop an awareness of themselves as knowledge producers in the information society."));
        tableData.add(new Course("HSS \nElective", "Introduction to \nPsychology",	"HSS204",	"Akshay \nKumar", "4", "Psy", "4:00-5:30\nC01", "", "4:00-5:30\nC01", "", "", "", "", "", "Students would have learnt about concepts of General Psychology. Students would learn about basics of how people think, feel and behave. Students would learn the history and schools of Psychology.  Students would be taught how to practice Mindfulness and would be able to practice it by their own.  Students would get to learn basics concepts of therapies and some practical skills of how to practice them.  Student would be able to practice the concepts of Cognitive behavior Therapy and be able to practically study their own thoughts and manage them."));
        tableData.add(new Course("HSS \nElective", "Theory & Practice of \nEngineering Ethics",	"HSS208", "Raj\nAyyar", "4" ,"TPEE" , "", "4:00-5:30\nC22", "","", "4:00-5:30\nC22", "", "", "", "Demonstrate a clear understanding of meta-ethical theories. Apply meta-ethical theories to engineering and IT scenarios. Develop a finessed multi-perspectival understanding of moral issues. Evaluate moral statements and practices clearly and critically."));
        tableData.add(new Course("HSS \nElective", "Theatre \nAppreciation", "HSS211", "Manohar \nKhushlani", "4", "TA",	"4:00-5:30\nC12", "", "4:00-5:30\nC12", "", "", "", "", "", "Student have Knowledge of Biographies and Techniques proposed by Theatre Masters Students have ability to Overcome inhibitions in communication Students have ability to put up a mime show Students have some ability to perform a play"));
        tableData.add(new Course("HSS \nElective", "Key Concepts in \nEconomic Sociology",	"HSS2ES",	"Amrit \nSrinivasan",	"4", "ES",	"", "4:00-5:30\nC24", "", "", "4:00-5:30\nC24", "", "", "", "Economic Sociology on the other hand encourages students to see rational self-interest and action as embedded in society, influenced by group dynamics, legal institutions, power, organizations and even culture. It justifies the application of independent sociological methods and concepts to the examination and understanding of the Economy as a sphere of production, consumption and exchange of goods and services, which is observable in all human societies, not only the modern and advanced. It thereby encourages students to relate economic actions to all other forms of social actions observable in society â€“ the religious, the familial, the technological and the political. In sum, Economic sociology identifies the obligatory, symbolic and power seeking motivations underlying human economic action, not only the useful or utilitarian"));
        tableData.add(new Course("HSS \nElective",	"Introduction to \nDigital Ethonography",	"HSS2xx", "Shriram \nVenkatraman", "4", "IDE", "4:00-5:3\n\nC11", "", "4:00-5:30\nC11", "", "", "", "", "", "This course is intended to be an introductory course and will systematically introduce learners to the basics of Digital Ethnography. The course will first introduce learners to the fundamentals of Ethnography as a research method and will then help facilitate its application to the Digital world."));
        tableData.add(new Course("HSS \nElective",	"Introduction to \nMedia in Society : \nA Public Sphere \nApproach",	"HSS2xx", "Aasim \nKhan", "4", "IMS", "", "4:00-5:30\nC03", "", "", "4:00-5:30\nC03", "", "", "", "This course is intended to be an introductory course and will systematically introduce learners to the basics of Digital Ethnography. The course will first introduce learners to the fundamentals of Ethnography as a research method and will then help facilitate its application to the Digital world."));
        tableData.add(new Course("HSS \nElective",	"Introduction to \nSocial Informatics",	"HSS2xx", "Venkata \nRatandeep \nSuri", "4", "ISI", "", "4:00-5:30\nC13", "", "", "4:00-5:30\nC13", "", "", "", "Social informatics is an interdisciplinary field of research dedicated to studying the design, use and effects of information technologies. Social informatics seeks to understand how social contexts shape the form and character of technology. Likewise it also studies how technology influences power relationships and restructures social and organizational networks. In this course we will be developing our understanding of these issues by engaging critically with various controversial topics relating to information and communication technologies. This course urges students to go beyond the â€œmerely technicalâ€ aspects of ICTs and consider the social relations that are an integral part of designing and adopting a technology or a technological system. It also challenges students to think critically about technological change and acquire a more sophisticated understanding of the process."));
        tableData.add(new Course("HSS \nElective",    "Introduction to \nPoetry", "HSS223A", "Saumya \nKulshreshtha", "4", "PO", "", "4:30-6:00\nC02" , "", "", "", "", "", "", "Major schools of poetry post 19th century. Major English language poets from the British and American canon, post romantic era. Evolution of English poetry in India, along with famous poets. Figures of speech and different forms of poetry."));

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

    @FXML
    private void searchKeywordButtonShow(ActionEvent event) {
        ObservableList<Course> tableData = FXCollections.observableArrayList();
        String inputKeyword = keywordInput.getText();
        for(Course c: allCoursesArrayList){
//            if(c.postConditions.contains(inputKeyword)){
            if(Pattern.compile(Pattern.quote(inputKeyword), Pattern.CASE_INSENSITIVE).matcher(c.postConditions).find())
            {
                tableData.add(c);
            }
        }
        courseName11.setCellValueFactory(new PropertyValueFactory<Course, String>("name"));
        instructor11.setCellValueFactory(new PropertyValueFactory<Course, String>("instructor"));
        code11.setCellValueFactory(new PropertyValueFactory<Course, String>("code"));
        monday11.setCellValueFactory(new PropertyValueFactory<Course, String>("monday"));
        tuesday11.setCellValueFactory(new PropertyValueFactory<Course, String>("tuesday"));
        wednesday11.setCellValueFactory(new PropertyValueFactory<Course, String>("wednesday"));
        thursday11.setCellValueFactory(new PropertyValueFactory<Course, String>("thursday"));
        friday11.setCellValueFactory(new PropertyValueFactory<Course, String>("friday"));
        lab11.setCellValueFactory(new PropertyValueFactory<Course, String>("lab"));
        tut11.setCellValueFactory(new PropertyValueFactory<Course, String>("tut"));  
        
        searchKeywordTable.setItems(tableData);
    }

    @FXML
    private void allCoursesAddCourseButton(ActionEvent event) throws IOException {
        String iallCoursesCourseCodeEnter = allCoursesCourseCodeEnter.getText();
        if(iallCoursesCourseCodeEnter.trim().isEmpty())
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.setTitle("Missing field");
            stage.show();
            return;
        }
        for(Course c: allCoursesArrayList){
            if(c.code.equals(iallCoursesCourseCodeEnter))
            {
                currentStudentCourses.add(c);
                timeTableTable.setItems(getCourses());
                System.out.println("found course"+c);
                break;
            }
        }
    }

    @FXML
    private void personalTimeTableRemoveButton(ActionEvent event) throws IOException {
        String  ipersonalTimeTableRemoveCode = personalTimeTableRemoveCode.getText();
        if(ipersonalTimeTableRemoveCode.trim().isEmpty())
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.setTitle("Missing field");
            stage.show();
            return;
        }
        for(Course c: allCoursesArrayList){
            if(c.code.equals(ipersonalTimeTableRemoveCode))
            {
                currentStudentCourses.remove(c);
                timeTableTable.setItems(getCourses());
                System.out.println("found course"+c);
                break;
            }
        }   
    }

    @FXML
    private void courseByPostConditionAddCourse(ActionEvent event) throws IOException {
        String  icourseByPostConditionCode = courseByPostConditionCode.getText();
        if(icourseByPostConditionCode.trim().isEmpty())
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fillAllFields.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1)); 
            stage.setResizable(false);
            stage.setTitle("Missing field");
            stage.show();
            return;
        }
        for(Course c: allCoursesArrayList){
            if(c.code.equals(icourseByPostConditionCode))
            {
                currentStudentCourses.add(c);
                timeTableTable.setItems(getCourses());
                System.out.println("found course"+c);
                break;
            }
        }
    }
}

