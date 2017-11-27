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
public class Building {
    private String name; 
    private String address;
    private ObservableList<Sensor> building; 
    
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public Building(String name, String address, ObservableList<Sensor> building) {
        this.name = name;
        this.address = address;
        this.building = building; 
        
    }
    
    public void addSensor(Sensor... sensor) {
        for (Sensor s : sensor) {
            building.add(s);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    public void removeSensor(Sensor... sensor) {
        for (Sensor s : sensor) {
            building.remove(s);
        }
    }
    
    @Override
    public String toString() {
        return name + " " + address + " " + building.toString();
    }
    
}
