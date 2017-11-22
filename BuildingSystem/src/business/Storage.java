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
public class Storage {
    private ArrayList<Building> storage; 
    
    public Storage(ArrayList<Building> storage) {
        this.storage = storage;
    }
    
    public void addBuilding(Building... building) {
        for (Building b : building) {
            storage.add(b);
        }
    }
    
    @Override
    public String toString() {
        return storage.toString();
    }
}
