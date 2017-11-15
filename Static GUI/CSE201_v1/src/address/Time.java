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
        System.out.println(startHourFirst);
//        System.out.println(this.startTime.substring(2));
        int startMinuteFirst = Integer.parseInt(this.startTime.substring(3));
        System.out.println(startMinuteFirst);
        int startTimeFirst = startHourFirst*100 + startMinuteFirst;
        System.out.println(startTimeFirst);
        int endHourFirst = Integer.parseInt(this.endTime.substring(0,2));
        int endMinuteFirst = Integer.parseInt(this.endTime.substring(3));
        int endTimeFirst = endHourFirst*100 + endMinuteFirst;
        System.out.println(endTimeFirst);
        
        int startHourSecond = Integer.parseInt(check.startTime.substring(0,2));
        int startMinuteSecond = Integer.parseInt(check.startTime.substring(3));
        int startTimeSecond = startHourSecond*100 + startMinuteSecond;
                System.out.println(startTimeSecond);

        int endHourSecond = Integer.parseInt(check.endTime.substring(0,2));
        int endMinuteSecond = Integer.parseInt(check.endTime.substring(3));
        int endTimeSecond = endHourSecond*100 + endMinuteSecond;
                System.out.println(endTimeSecond);

        if((startTimeSecond > startTimeFirst) && (startTimeSecond < endTimeFirst))
            return true;
        if((endTimeSecond> startTimeFirst) && (endTimeSecond < endTimeFirst))
            return true;
        return false;
    }
}
