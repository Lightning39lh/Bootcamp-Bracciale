
package com.mycompany.ejvehiculos;



public class Carga extends Vehiculo{

    public Carga(String matricula) {
        super(matricula);
    }

    
    private Remolque remolque= null;
    public Remolque getRemolque() {
        return remolque;
    }
    
    public void ponRemolque(int peso){
        this.remolque=new Remolque(peso);
    }
            
    public void quitaRemolque(){
        this.remolque=null;
    }
    
   
    @Override
    public String toString(){
        if (this.remolque!=null){
            return ("matricula: "+super.matricula+" peso del remolque: "+this.remolque +"velocidad: "+super.velocidad);
        }else 
        return (super.toString());
    }
    @Override
    public void acelerar(int num) throws DemasiadoRapidoException{
         if (this.remolque!=null && getVelocidad()>100){
             throw new DemasiadoRapidoException();
         }else
        this.velocidad+=num;
    }
}
