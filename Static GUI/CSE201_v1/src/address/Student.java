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
public class Student extends newUser{
//    private String password;
    private AllCourses allCourses;
    private ArrayList<Course> currentCourses;
    private ArrayList<RequestRoomFromAdmin> currentRequestOfRoomBooking;
    private ArrayList<Course> listThatMatchGivenKeyword;
//    public Student( Credential userCredential, ArrayList<String> currentCourses, TimeTable timetable) {
//        super( userCredential, currentCourses, timetable);
//        currentCourses = new ArrayList<>();
//        currentRequestOfRoomBooking = new ArrayList<>();
//    }

    public Student(ArrayList<Course> currentCourses, ArrayList<RequestRoomFromAdmin> currentRequestOfRoomBooking, ArrayList<Course> listThatMatchGivenKeyword, String username, String fullname, String email, String password, String repassword, String type) {
        super(username, fullname, email, password, repassword, type);
        this.currentCourses = currentCourses;
        this.currentRequestOfRoomBooking = currentRequestOfRoomBooking;
        this.listThatMatchGivenKeyword = listThatMatchGivenKeyword;
    }
    
    
    
    public void onClickAddCourseFromStudent(Course addCourse){
        currentCourses.add(addCourse);
    }
    
    public void onClickRemoveCourseFromStudent(Course removeCourse){
        currentCourses.remove(removeCourse);
    }
    
    public ArrayList<Course> onClickSearchForCourse(String keyword){
        listThatMatchGivenKeyword = new ArrayList<>();
        for (Course iteratorCourse: allCourses.allCourses ) {
            if(iteratorCourse.postConditions.contains(keyword)){
                    listThatMatchGivenKeyword.add(iteratorCourse);
                }
        }
        return listThatMatchGivenKeyword;
    }
    
    public boolean onClickCancelPendingRequestFromStudent(RequestRoomFromAdmin roomToBeCancelled){
        if(currentRequestOfRoomBooking.contains(roomToBeCancelled)){
            currentRequestOfRoomBooking.remove(roomToBeCancelled);                    
            return true;
        }
        return false;
    }
    public String onClickChangeUserDetailsButton(String FirstName, String LastName, String oldPassword, String newPassword, String reNewPassword){
        if(this.password.equals(oldPassword)){
            if(newPassword.equals(reNewPassword)){
                //also change fisrstName and lastName;
                this.password = newPassword;
                return "Password Changed Successfully";
            }
            else{
                return "Passwords do not match";
            }
        }
        else{
            return "Incorrect Password";
        }
    }
    
    public String onClickRequestRoomButtonFromStudent(String roomNumber, int desiredCapacity, String startTime, String endTime, boolean book, String purpose){
        RequestRoomFromAdmin fromStudent;
        fromStudent= new RequestRoomFromAdmin(roomNumber, desiredCapacity, startTime, endTime, purpose);
        if(book){
            currentRequestOfRoomBooking.add(fromStudent);
            return "Booking request made Successfully";
        }
        else{
            if(onClickCancelPendingRequestFromStudent(fromStudent)){
                return "Cancelling Successful";
            }
            else{
                return "Cancelling Failed";
            }
        }
    }
    
    public String onClickAddCourseFromPostConditionButtonFromStudent(Course courseToBeAdded){
        for (Course currentCourse : currentCourses) {
            Time currentCourseTime = new Time(currentCourse.time, "a");
            Time courseToBeAddedTime = new Time(email, email);
            if(currentCourseTime.checkClash(courseToBeAddedTime)){
                return "Course clashed with " + currentCourse.getName();
            }   
        }
        currentCourses.add(courseToBeAdded);
        return "Course Added Successfully";
    }

    public ArrayList<RequestRoomFromAdmin> getCurrentRequestOfRoomBooking() {
        return currentRequestOfRoomBooking;
    }

    public ArrayList<Course> getCurrentCourses() {
        return currentCourses;
    }

    public ArrayList<Course> getListThatMatchGivenKeyword() {
        return listThatMatchGivenKeyword;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setCurrentRequestOfRoomBooking(ArrayList<RequestRoomFromAdmin> currentRequestOfRoomBooking) {
        this.currentRequestOfRoomBooking = currentRequestOfRoomBooking;
    }
    
}

