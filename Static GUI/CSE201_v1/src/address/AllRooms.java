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
    private ArrayList<Room> busyRooms;
    private ArrayList<Room> availableRooms;
    private ArrayList<Room> getAvailableRooms(){
        return availableRooms;
    }
    private void addRoom(Room addIt){
        roomList.add(addIt);
        availableRooms.remove(addIt);
    }
    
    private void freeRoom(Room freeIt){
        
    }
            
}
