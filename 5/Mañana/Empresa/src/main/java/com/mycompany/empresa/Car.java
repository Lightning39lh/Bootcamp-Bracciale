
package com.mycompany.empresa;

/**

 */
public class Car {

    private String plate;
    private String brand;
    private String model;
    
    public Car(String plate, String brand, String model) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
    }
    
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
}
