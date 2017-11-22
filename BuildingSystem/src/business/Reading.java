/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.security.Timestamp;

/**
 *
 * @author ander
 */
public class Reading {
    private Timestamp time; 
    private double value; 
    private String type;
    private int id; 
    
    public Reading(Timestamp time, double value, String type, int id) {
        this.time = time;
        this.value = value;
        this.type = type;
        this.id = id; 
    }
    
}
