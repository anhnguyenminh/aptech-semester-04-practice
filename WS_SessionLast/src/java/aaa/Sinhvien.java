/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaa;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    private String roll;
    private String name;

    public Sinhvien(String roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public Sinhvien() {
    }
    

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "roll=" + roll + ", name=" + name + '}';
    }
    
    
}
