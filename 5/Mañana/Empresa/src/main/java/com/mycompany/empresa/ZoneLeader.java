
package com.mycompany.empresa;

import java.util.ArrayList;

/**

 */
public class ZoneLeader extends Employee{

    private String office;
    private Secretary secretary;
    private ArrayList<Vendor> vendors;
    private Car car;
    
    public ZoneLeader(String office, Secretary secretary, ArrayList<Vendor> vendors, Car car, String dni, String name, String lastName, String address, int since, String phone, double salary, Employee supervisor) {
        super(dni, name, lastName, address, since, phone, salary, supervisor);
        this.office = office;
        this.secretary = secretary;
        this.vendors = vendors;
        this.car = car;
    }

    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public Secretary getSecretary() {
        return secretary;
    }
    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
    public ArrayList<Vendor> getVendors() {
        return vendors;
    }
    public void setVendors(ArrayList<Vendor> vendors) {
        this.vendors = vendors;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    
    @Override
    public void setSalary(double salary)
    {
	salary =  salary + (salary*0.20)*since;
    }
    @Override
    public String toString() {
	return "ZoneLeader ["+super.toString()+ ", office:" + office + ", secretary:" + secretary + ", vendors:" + vendors + ", car:" + car + "]";
    }
    public void addVendor(Vendor vendor)
    {
	vendors.add((Vendor)vendor);
    }
    public void removeVendor(int i)
    {
	vendors.remove(i);
    }
    
}
