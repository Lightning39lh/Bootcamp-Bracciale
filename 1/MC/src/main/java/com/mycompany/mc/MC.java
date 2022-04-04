
package com.mycompany.mc;

import java.util.Scanner;

/*Realizar un algoritmo que permita calcular el índice de masa corporal de una persona, ingresando sus valores del peso y la altura,  indique su valor según la siguiente tabla:
Valor de IMC
Diagnóstico
< 20 Mal estado
De 20 a 22 Bajo de Peso
De 22 a 25 Peso Normal
De 25 a 30 Sobrepeso
De 20 a 40 Sobrepeso crónico
> 40 Hospitalizado
Tomando en cuenta la fórmula para el cálculo de la masa corporal MC=PESO/ALTURA */
public class MC {

    public static void main(String[] args) {
        
        float altura,peso,mc;
        Scanner sc= new Scanner (System.in);
    
        System.out.println("ingrese el peso");
        peso = sc.nextFloat();
        System.out.println("ingrese la altura");
        altura = sc.nextFloat();
        mc= peso/(altura*altura);  
        if (mc < 20){
            System.out.println("Se encuentra en mal estado");
        } else if (mc < 22){
            System.out.println("Se encuentra bajo de peso");
        } else if (mc < 25) {
            System.out.println("Se encuentra en peso normal");
        } else if (mc < 30) {
            System.out.println("Se encuentra en sobrepeso");
        } else if (mc < 40) {
            System.out.println("Se encuentra en sobrepeso cronico");
        } else {
            System.out.println("Se encuentra hospitalizado");
        }
     
    }
}
