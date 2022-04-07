/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;

import java.util.ArrayList;

/**

 */
public class Alumno extends Persona{

    
   
    private ArrayList <Integer> notas = new ArrayList <>();
    
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    
     public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public void addNota(int nota){
        this.notas.add(nota);
    }
    
    public double calculaPromedio(){
        int suma=0;
        for (int i=0; i<notas.size();i++){ // buscar forma para hacerlo mas bonito
            suma+=notas.get(i);
        }
        return suma/(notas.size());
    }
    public String clasificaPromedio(){
        if (calculaPromedio()>7){
            return "promosiona";
        } else if (calculaPromedio()>4){
            return "habilita para dar final";  
        } else return "recursa";
    }
    
    

 
    
}
