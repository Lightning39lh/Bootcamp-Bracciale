
package com.mycompany.empresa;

/**

 */
public class Employee {

    protected String name;
    protected String lastName;
    protected String dni;
    protected String address;
    protected int since;
    protected String phone;
    protected double salary;
    Employee supervisor;
    
    public Employee(String dni, String name, String lastName, String address, int since, String phone, double salary, Employee supervisor) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.since = since;
        this.phone = phone;
        this.salary = salary;
        this.supervisor = supervisor;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String firstName) {
        this.name = firstName;
    }
    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        this.lastName = lastname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSince() {
        return since;
    }
    public void setSince(int since) {
        this.since = since;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
    
    public void incrementSalary(double cant)
	{
		 salary+= cant;
	}
    @Override
   public String toString() {
		return "Employer [Name: " + name + " last name:" + lastName + ", DNI:" + dni + ", address: " + address
				+ ", since:" + since + ", phone:" + phone + ", salary:" + salary + ", supervisor:" + supervisor + "]";
	}
    
}
