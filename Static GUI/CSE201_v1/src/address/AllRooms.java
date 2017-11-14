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

public class AllRooms {
    private ArrayList<Room> roomList;
    private ArrayList<RoomTime> busyRooms;
//    private ArrayList<RoomTime> availableRooms;

    public AllRooms() {
        roomList = new ArrayList<>();
        busyRooms = new ArrayList<>();
//        availableRooms = new ArrayList<>();
    }
    
    //getAvailableRooms at given time
    public ArrayList<Room> getAvailableRooms(Time time){
        ArrayList<Room> returnAvailableRooms = new ArrayList<>();
        for (Room roomIterator : roomList) {
            if(roomIterator.isAvailableAtGivenTime(time)){
                returnAvailableRooms.add(roomIterator);
            }
        }
        return returnAvailableRooms;
    }
    
    //check any room availability at any given time
    public boolean checkRoomAvailabilty(Room room, Time time){
        return room.isAvailableAtGivenTime(time);
    }
    
    
    public boolean bookRoom(Room room, Time time){
        if(checkRoomAvailabilty(room, time)){
            RoomTime roomWithGivenTime = new RoomTime(room, time);
            busyRooms.add(roomWithGivenTime);
        }
        return false;
    }
    
    
    public boolean freeRoom(Room room, Time time){
        RoomTime freeRoomWithGivenTime = new RoomTime(room, time);
        busyRooms.remove(freeRoomWithGivenTime);
        return true;
    }
}
