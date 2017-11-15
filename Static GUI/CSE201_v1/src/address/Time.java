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
public class Time {
    private String startTime; //HH-MM
    private String endTime;   
    
    public Time(String start, String end) {
        startTime = start;
        endTime = end;
    }
    //Time format will be 10:30 
    public String getStartTime(){
        return startTime;
    }
    public String getEndTime(){
        return endTime;
    }
    
    public boolean checkClash(Time check){
        int startHourFirst = Integer.parseInt(this.startTime.substring(0,2));
        int startMinuteFirst = Integer.parseInt(this.startTime.substring(2,4));
        int startTimeFirst = startHourFirst + startMinuteFirst;
        
        int endHourFirst = Integer.parseInt(this.endTime.substring(0,2));
        int endMinuteFirst = Integer.parseInt(this.endTime.substring(2,4));
        int endTimeFirst = endHourFirst + endMinuteFirst;
        
        int startHourSecond = Integer.parseInt(check.startTime.substring(0,2));
        int startMinuteSecond = Integer.parseInt(check.startTime.substring(2,4));
        int startTimeSecond = startHourSecond + startMinuteSecond;
        
        int endHourSecond = Integer.parseInt(check.endTime.substring(0,2));
        int endMinuteSecond = Integer.parseInt(check.endTime.substring(2,4));
        int endTimeSecond = endHourSecond + endMinuteSecond;
        
        if((startTimeSecond > startTimeFirst) && (startTimeSecond < endTimeFirst))
            return true;
        if((endTimeSecond> startTimeFirst) && (endTimeSecond < endTimeFirst))
            return true;
        return false;
    }
}
