package com.vetias.java.workshop.temperaturedata.beans;
import java.time.LocalDateTime;

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    public void setName(String aName){
        name=aName;
    }
    public String getName(){
        return name;

    }
    public void setArea(String aArea){
        name=aArea;

    }
    public double getArea(){
        return area;
    }
    public int getFloors(){
        return floors;
    }
}
