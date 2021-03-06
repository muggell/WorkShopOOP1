/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import acquaintance.IBusiness;
import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author ander
 */
public class Storage {
    private ObservableList<Building> storage; 
    
    public Building getBuilding(int placement) {
        return storage.get(placement);
    }
    
    public Storage(ObservableList<Building> storage) {
        this.storage = storage;
    }
    
    public void addBuilding(Building... building) {
        for (Building b : building) {
            storage.add(b);
        }
    }
    
    public void removeBuilding(Building... building) {
        for (Building b : building) {
            storage.remove(b);
        }
    }
    
    @Override
    public String toString() {
        return storage.toString();
    }
}
