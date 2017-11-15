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
public class Admin extends newUser{


    public Admin(String username, String fullname, String email, String password, String repassword, String type) {
        super(username, fullname, email, password, repassword, type);
        requestFromStudents = new ArrayList<>();
    }
    
    
    public ArrayList<String> getAvailableRooms(){
            return null;
    }
    
    public void onClickRequestForRoomFromStudentLogin(String roomNumber, int desiredCapacity, String startTime, String endTime, boolean book, String purpose){
        RequestRoomFromAdmin fromStudent;
        fromStudent = new RequestRoomFromAdmin(roomNumber, desiredCapacity, startTime, endTime, purpose);
        if(book)
        requestFromStudents.add(fromStudent);
    }
    
}
