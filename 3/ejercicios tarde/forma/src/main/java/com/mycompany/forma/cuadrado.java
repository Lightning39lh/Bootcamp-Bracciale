
package com.mycompany.forma;

/**

 */
public class cuadrado extends Forma{

    private int lado;
    
    public int getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public double calcularPerimetro(){
   return lado*4;   
  };
 
    
    
    
}
