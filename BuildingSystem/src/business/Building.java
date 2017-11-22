/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author ander
 */
public class Building {
    private String name; 
    private String address;
    private ArrayList<Sensor> building; 
    
    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public Building(String name, String address, ArrayList<Sensor> building) {
        this.name = name;
        this.address = address;
        this.building = building; 
        
    }
    
    public void addSensor(Sensor sensor) {
        building.add(sensor);
    }
    
}
