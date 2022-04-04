
package com.mycompany.triangulo;


public class Triangulo {

    private int lado1,lado2,lado3;
    
    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }
 
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public int getLado3() {
        return lado3;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    
    public String TipoDeTriangulo() {
        if(lado1==lado2 && lado1==lado3){
            return "Triangulo Equilatero";
	}else if ((lado1==lado2) || (lado1==lado3) || (lado2==lado3)) {
            return "Triangulo Isoseles";
	}else{
            return "Triangulo Escaleno";
	}
}
    //excercise 1
    public int PerimetroTriangulo(){
        return lado1+lado2+lado3;
    }
    
}
    

			
	
   
