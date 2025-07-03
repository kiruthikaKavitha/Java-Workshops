package com.vetias.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private int Zoneid;
    private String type;
    private double area;
    private String description;
    private String country;
    private String city;
    private String address;
         // Setters and Getters
    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setZoneid(int aZoneid) {
        Zoneid = aZoneid;
    }
    public int getZoneid() {
        return Zoneid;
    }
    public void setType(String aType) {
        type = aType;
    }
    public String getType() {
        return type;
    }
    public void setArea(double aArea) {
        area = aArea;
    }
    public double getArea() {
        return area;
    }
    


    
}
