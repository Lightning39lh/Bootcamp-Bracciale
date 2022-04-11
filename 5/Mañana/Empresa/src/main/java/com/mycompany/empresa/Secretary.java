
package com.mycompany.empresa;

/**
 
 */
public class Secretary extends Employee{

    private String office;
    private int fax;
    
    public Secretary(String office, int fax, String dni, String name, String lastName, String address, int since, String phone, double salary, Employee supervisor) {
        super(dni, name, lastName, address, since, phone, salary, supervisor);
        this.office = office;
        this.fax = fax;
    }

    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public int getFax() {
        return fax;
    }
    public void setFax(int fax) {
        this.fax = fax;
    }
    
    @Override
    public void setSalary(double salary)
    {
	salary =  salary + (salary*0.05)*since;
    }
    
    @Override
public String toString() {
	return "Secretary ["+ super.toString()+ ", office:" + office + ", fax:" + fax + "]";
}
    
    
}
