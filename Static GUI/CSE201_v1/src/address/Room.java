/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Madhav
 */
public class Room {
    private String roomNumber;
    private int capacity;
    private boolean occupied;
    private Time time;
    //Room Availability will change from Time to Time
    public Room(String roomNumber, int capacity, boolean occupied, Time time){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = occupied;
        this.time = time;
    }
    
}
