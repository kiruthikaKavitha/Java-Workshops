package com.vetias.java.workshop.temperaturedata.beans;

public interface Sensor {
    public float getReading();
public class TemperatureSensor implements Sensor {
    private float reading;

    public TemperatureSensor(float aTemperature) {
        
    }

    @Override
    public float getReading() {
        return temperature;
    }

    public void setReading(float temperature) {
        this.temperature = temperature;
    }
}
}



