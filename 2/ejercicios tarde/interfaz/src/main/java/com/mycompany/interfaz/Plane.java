
package com.mycompany.interfaz;


public class Plane implements Vehiculo  {
    private String model;
    private boolean flying = false;
    private int capacity;
    private int passengers = 0;
    private int fuel = 0;
    private boolean motor = false;
    private int fuelCost = 600; //per km
    

    public int getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(int fuelCost) {
        this.fuelCost = fuelCost;
    }
    
    

    public Plane(String model, int capacity)
    {
        this.model = model; 
        this.capacity = capacity;
    }
    //getters and setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public boolean isFlying() {
        return flying;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getPassengers() {
        return passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    //methods
    public void launch() {
        if (this.motor){
        flying =true;
        }
        
    }
    public void land() {
        flying =false;
    }

    public boolean checkCapacity()
    {
        if(capacity - passengers != 0)
            return true;
            else 
                return false;
    }
    public void addPassenger()
    {
     if(checkCapacity())
            passengers++;
     else
         System.out.println("Sorry, the plane is already full!"); //make an exception
    }

    @Override
    public void fueling(int num) {
        this.fuel+=num;
    }

    @Override
    public void on() {
        this.motor=true;
    }
    
    @Override
    public void off() {
        this.motor=false;
    }

    @Override
    public int costTravel(int km, int fuel) {
        this.fuel-=fuel;
        return km*fuelCost; 
    }
    
}