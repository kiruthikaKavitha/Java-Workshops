public class TemperatureSensor implements Sensor {

    private float temperature;
    private TemperatureSensor(float aTemperature) {
        temperature = aTemperature;

    
    }
    
    public float getReading() {
        return temperature;
    }
}
