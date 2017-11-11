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
public class Course {
    private String name;
    private DetailsOfCourse CourseDetails;
    private ArrayList<String> postConditions;
    private ArrayList<String> preRequisites;
    private ArrayList<String> keywords;

    public Course(String name, DetailsOfCourse CourseDetails, ArrayList<String> postConditions, ArrayList<String> preRequisites, ArrayList<String> keywords) {
        this.name = name;
        this.CourseDetails = CourseDetails;
        this.postConditions = postConditions;
        this.preRequisites = preRequisites;
        this.keywords = keywords;
    }
    
    
}
