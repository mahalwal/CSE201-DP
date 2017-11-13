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
public class Admin extends User{

    public Admin(MainApp run, Credential userCredential, ArrayList<String> currentCourses, TimeTable timetable) {
        super(run, userCredential, currentCourses, timetable);
    }
    public ArrayList<String> getAvailableRooms(){
//        return currentCourses;
            return null;
    }
    
}
