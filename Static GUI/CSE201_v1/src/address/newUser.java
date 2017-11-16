/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mahalwal's
 */
public class newUser implements Serializable, Cloneable{
    public String username, fullname, password, repassword, email, type;
    public ArrayList<Course> allTempStudentCoursesArrayList = new ArrayList<Course>(); //for remaining courses which student hasnt chosen
    public ArrayList<Course> currentStudentCourses = new ArrayList<Course>();
    
    public newUser(String username, String fullname, String email, String password, String repassword, String type) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.repassword = repassword;
        this.email = email;
        this.type = type;
    }
    public newUser clone() throws CloneNotSupportedException{
        try{
            newUser copy = (newUser) super.clone();
            copy.allTempStudentCoursesArrayList = allTempStudentCoursesArrayList;//new ArrayList<Course>(allTempStudentCoursesArrayList);
            copy.currentStudentCourses = currentStudentCourses;//new ArrayList<Course>(currentStudentCourses);
            return copy;
        }catch(CloneNotSupportedException e){
            return null;
        }
    }

//    public newUser() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString() {
        return "newUser{" + "username=" + username + ", fullname=" + fullname + ", password=" + password + ", repassword=" + repassword + ", email=" + email + ", type=" + type + ", allTempStudentCoursesArrayList=" +  ", currentStudentCourses=" + currentStudentCourses + '}';
    }
    




    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final newUser other = (newUser) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}