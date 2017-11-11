/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.util.ArrayList;

/**
 *
 * @author Madhav
 */
public class User {
    MainApp run;
    private Credential userCredential;
    private ArrayList<String> currentCourses;
    private TimeTable timetable;

    public User(MainApp run, Credential userCredential, ArrayList<String> currentCourses, TimeTable timetable) {
        this.run = run;
        this.userCredential = userCredential;
        this.currentCourses = currentCourses;
        this.timetable = timetable;
    }
    
}
