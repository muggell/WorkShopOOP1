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
        Reading r1 = new Reading(5000, 30, "temperature", 1);
        Reading r2 = new Reading(5500, 32, "temperature", 2);
        Reading r3 = new Reading(6000, 34, "temperature", 3); 
        
        ArrayList<Reading> sr = new ArrayList<>();
      
        Sensor s1 = new Sensor(sr, 1); 
        s1.addReading(r1, r2, r3);
        
        System.out.println(s1.getHistory());
        System.out.println(s1.getSensorReading());
    }
    
}
