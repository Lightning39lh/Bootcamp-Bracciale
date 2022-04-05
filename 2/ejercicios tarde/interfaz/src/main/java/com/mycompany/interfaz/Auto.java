/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

/**

 */
public class Auto implements Vehiculo{

    private String model;
    private int fuel = 0;
    private boolean motor=false;
    private int fuelCost = 300; //per km

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public int getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(int fuelCost) {
        this.fuelCost = fuelCost;
    }
    
    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void fueling(int num) {
        this.fuel+=num;
    }

    @Override
    public void on() {
        this.motor = true;
    }

    @Override
    public void off() {
       this.motor = false; 
    }

    @Override
    public int costTravel(int km, int fuel) {
        this.fuel-=fuel;
        return km*fuelCost;
    }
    
}
