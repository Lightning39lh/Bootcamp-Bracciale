
package com.mycompany.escuela;

/**
 
 */
public class Docente extends Persona{

   
    private int cantAlumnos;

    public Docente(int cantAlumnos, String nombre, String apellido) {
        super(nombre, apellido);
        this.cantAlumnos = cantAlumnos;
    }
    
    
    
    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }
    
/*    public void pedirNotas (arrayList<Integer> ){
        
    }*/
    
    
}
