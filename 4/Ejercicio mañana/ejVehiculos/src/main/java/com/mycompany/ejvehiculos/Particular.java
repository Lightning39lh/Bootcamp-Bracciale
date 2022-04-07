
package com.mycompany.ejvehiculos;

/**

 */
public class Particular extends Vehiculo {

    
    private int cantPuertas;

    public Particular (String matricula,int cantPuertas) {
        super(matricula);
        this.cantPuertas = cantPuertas;
    }
    
    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
}
