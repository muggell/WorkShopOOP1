/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author ander
 */
public class Sensor {
    private ObservableList<Reading> sensorReading; 
    private int id; 

    public Sensor(ObservableList<Reading> sensorReading, int id) {
        this.sensorReading = sensorReading;
        this.id = id;
    }

    public Reading getSensorReading() {
        return sensorReading.get(sensorReading.size() - 1);
    }
    
    public ObservableList<Reading> getHistory() {
        return sensorReading;
    }

    public int getId() {
        return id;
    }

    public void setSensorReading(ObservableList<Reading> sensorReading) {
        this.sensorReading = sensorReading;
    }
    
    public void addReading(Reading... reading) {
        for (Reading r1 : reading)
            sensorReading.add(r1);
    }
    
    @Override
    public String toString() {
        return id + sensorReading.toString();
    }
    
    
    
}
