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
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // making readings
        Reading r1 = new Reading(5000, 30, "temperature", 1);
        Reading r2 = new Reading(5500, 32, "temperature", 2);
        Reading r3 = new Reading(6000, 34, "temperature", 3); 
        Reading r4 = new Reading(3000, 500, "co2", 4);
        Reading r5 = new Reading(3500, 510, "co2", 5);
        Reading r6 = new Reading(3000, 520, "co2", 6);
        
        // to sensor
        ArrayList<Reading> sr = new ArrayList<>();
        Sensor s1 = new Sensor(sr, 1); 
        s1.addReading(r1, r2, r3);
        System.out.println("For tempsensor: " + s1.getHistory());
        
        ArrayList<Reading> sr2 = new ArrayList<>();
        Sensor s2 = new Sensor(sr2, 2);
        s2.addReading(r4, r5, r6);
        System.out.println("For co2: " + s2.getHistory());
        
        // to building
        ArrayList<Sensor> bs = new ArrayList<>();
        bs.add(s1);
        Building b1 = new Building("Bygning1 ", "Nørregårsvænget 50, 5270 ", bs);    
        System.out.println(b1);
        
        ArrayList<Sensor> bs2 = new ArrayList<>();
        bs2.add(s2);
        Building b2 = new Building("Bygning2 ", "Nyvangsvej 19b, 5000", bs2);
        System.out.println(b2);
  
        
        // to storage
        ArrayList<Building> sb = new ArrayList<>();
        sb.add(b1);
        Storage storage1 = new Storage(sb);
        storage1.addBuilding(b2);
        System.out.println(storage1);
        storage1.removeBuilding(b1);
        System.out.println(storage1);
    }
    
}
