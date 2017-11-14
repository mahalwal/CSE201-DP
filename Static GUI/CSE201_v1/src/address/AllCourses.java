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
public class AllCourses {
    static ArrayList<Course> allCourses;

    public AllCourses() {
        allCourses = new ArrayList<>();
    }
    
    public ArrayList<Course> getAllCourses(){
        return this.allCourses;
    }
    
}
