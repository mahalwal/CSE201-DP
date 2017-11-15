/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Madhav
 */

public class AllRooms {
    public static ArrayList<Room> roomList;
    public static ArrayList<RoomTime> busyRooms;
//    private ArrayList<RoomTime> availableRooms;
    
    public AllRooms() {
        roomList = new ArrayList<Room>();
        Room C01 = new Room("C01", 100);roomList.add(C01);
        Room C02 = new Room("C02", 20);roomList.add(C02);
        Room C03 = new Room("C03", 20);roomList.add(C03);
        Room C04 = new Room("C04", 20);roomList.add(C04);
        Room C11 = new Room("C11", 100);roomList.add(C11);
        Room C12 = new Room("C12", 20);roomList.add(C12);
        Room C13 = new Room("C23", 20);roomList.add(C13);
        Room C14 = new Room("C24", 20);roomList.add(C14);
        Room C21 = new Room("C21", 100);roomList.add(C21);
        Room C22 = new Room("C22", 20);roomList.add(C22);
        Room C23 = new Room("C23", 20);roomList.add(C23);
        Room C24 = new Room("C24", 20);roomList.add(C24);
        
        busyRooms = new ArrayList<>();
//        availableRooms = new ArrayList<>();
    }
    
    //getAvailableRooms at given time
    public static ObservableList<Room> getAvailableRooms(Time time){
        ObservableList<Room> returnAvailableRooms = FXCollections.observableArrayList();
        
        for (Room roomIterator : roomList) {
//            System.out.println(roomIterator.roomNumber);
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
