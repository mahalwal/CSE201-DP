/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import address.Time;

/**
 *
 * @author Madhav
 */
public class RequestRoomFromAdmin {
    String roomNumber;
    int capacity;
    Time time;
    String purpose;

    public RequestRoomFromAdmin(String roomNumber, int capacity, String startTime, String endTime, String purpose) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.time = time;
        if(purpose.equals(""))
        this.purpose = "Purpose not mentioned";
    }
    
}
