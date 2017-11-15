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
public class Course {
    public String name,room,time, acronym, instructor, mandatoryElective, credits, code, monday, tuesday, wednesday, thurdsday, friday, tut, lab, preConditions, postConditions;//room to be addded
//    private DetailsOfCourse CourseDetails;
//    private ArrayList<String> postConditions;
//    private ArrayList<String> preRequisites;
//    private ArrayList<String> keywords;

    public Course(String mandatoryElective, String name, String code, String instructor, String credits, String acronym, String monday, String tuesday, String wednesday, String thurdsday, String friday, String tut, String lab, String preConditions, String postConditions) {
        this.name = name;
        this.time = time;
        this.acronym = acronym;
        this.instructor = instructor;
        this.mandatoryElective = mandatoryElective;
        this.credits = credits;
        this.code = code;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thurdsday = thurdsday;
        this.friday = friday;
        this.tut = tut;
        this.lab = lab;
        this.preConditions = preConditions;
        this.postConditions = postConditions;
    }

    public String getMandatoryElective() {
        return mandatoryElective;
    }

    public void setMandatoryElective(String mandatoryElective) {
        this.mandatoryElective = mandatoryElective;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThurdsday() {
        return thurdsday;
    }

    public void setThurdsday(String thurdsday) {
        this.thurdsday = thurdsday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getTut() {
        return tut;
    }

    public void setTut(String tut) {
        this.tut = tut;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getPreConditions() {
        return preConditions;
    }

    public void setPreConditions(String preConditions) {
        this.preConditions = preConditions;
    }

    public String getPostConditions() {
        return postConditions;
    }

    public void setPostConditions(String postConditions) {
        this.postConditions = postConditions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", time=" + time + ", acronym=" + acronym + ", instructor=" + instructor + ", mandatoryElective=" + mandatoryElective + ", credits=" + credits + ", code=" + code + ", monday=" + monday + ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thurdsday=" + thurdsday + ", friday=" + friday + ", tut=" + tut + ", lab=" + lab + ", preConditions=" + preConditions + ", postConditions=" + postConditions + '}';
    }
}
