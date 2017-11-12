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
public class DetailsOfCourse {
    private int numberOfStudents;
    private Room roomAlloted;
    private Time timeSlot;

    public DetailsOfCourse(int number, Room room, Time time) {
        numberOfStudents = number;
        roomAlloted = room;
        timeSlot = time;
    }
    
    
}
