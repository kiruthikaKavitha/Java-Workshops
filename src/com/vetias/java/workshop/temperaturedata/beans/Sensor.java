package com.vetias.java.workshop.temperaturedata.beans;

public class Sensor {
    private String name;
    private int Sensorid;
    private double temperature;
       // Setters and Getters
    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }
    public void setSensorid(int aSensorid) {
        Sensorid = aSensorid;
    }
    public int getSensorid() {
        return Sensorid;
    }
    public void setTemperature(double aTemperature) {
        temperature = aTemperature;
    }
    public double getTemperature() {
        return temperature;
    }
    
}





