/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejvehiculos;

/**
 *
 * @author M_Her
 */
public class Vehiculo {

    protected String matricula;
    protected int velocidad=0;
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String toString(){
        return ("matricula: "+matricula+" velocidad: "+velocidad);
    }
    
    public void acelerar(int num) throws DemasiadoRapidoException{
        this.velocidad+=num;
    }
 
    
    
}
