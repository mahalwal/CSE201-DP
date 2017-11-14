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
public class Room {
    private String roomNumber;
    private int capacity;
    private ArrayList<Time> roomBusyTime;
    //Room Availability will change from Time to Time
    public Room(String roomNumber, int capacity){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        roomBusyTime = new ArrayList<Time>();
    }
    public void bookRoomForGivenTime(Time time){
        roomBusyTime.add(time);
    }
    public boolean isAvailableAtGivenTime(Time time){
        if(roomBusyTime.contains(time))
            return false;
        return true;
    }
}
