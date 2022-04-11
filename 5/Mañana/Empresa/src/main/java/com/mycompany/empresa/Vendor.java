/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import java.util.ArrayList;

/**
 *
 * @author M_Her
 */
public class Vendor extends Employee{

    private Car car;
    private String vendorPhone;
    private String area;
    private ArrayList<Client>clients;
    private int porcentage;
    
    public Vendor(Car car, String vendorPhone, String area, ArrayList<Client> clients, int porcentage, String dni, String name, String lastName, String address, int since, String phone, double salary, Employee supervisor) {
        super(dni, name, lastName, address, since, phone, salary, supervisor);
        this.car = car;
        this.vendorPhone = vendorPhone;
        this.area = area;
        this.clients = clients;
        this.porcentage = porcentage;
    }

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    } //or changeCar 
    public String getVendorPhone() {
        return vendorPhone;
    }
    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public ArrayList<Client> getClients() {
        return clients;
    }
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    public int getPorcentage() {
        return porcentage;
    }
    public void setPorcentage(int porcentage) {
        this.porcentage = porcentage;
    }


    @Override
    public void setSalary(double salary)
{
	
	salary =  salary + (salary*0.10)*since;
}
    public void addClient(Client client){
        clients.add((Client)client);
    }
    public void removeClient(int i){
        clients.remove((i));
    }    
    
    
    @Override
    public String toString() {
	return "Vendor ["+super.toString()+"car:" + car + ", vendorPhone:" + vendorPhone + ", area:" + area + ", clients:" + clients+"]";
}
}
