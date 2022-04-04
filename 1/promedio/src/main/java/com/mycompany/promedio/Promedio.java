
package com.mycompany.promedio;

import java.util.Scanner;

/*Realizar un programa para calcular el promedio de tres notas, e indique si el promedio es menor de 10 que muestre reprobado, 
si es mayor que 10 pero menor que 15 aprobado, y mayor de 15 eximido.
*/
public class Promedio {

    public static void main(String[] args) {
       float nota1,nota2,nota3,promedio;
       Scanner sc= new Scanner (System.in);
        System.out.println("ingrese la nota 1");
        nota1 = sc.nextFloat();
        System.out.println("ingrese la nota 2");
        nota2 = sc.nextFloat();
        System.out.println("ingrese la nota 3");
        nota3 = sc.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        if (promedio <10){
        System.out.println("reprobado");    
        } else if (promedio <15){
        System.out.println("aprobado");        
        } else {
            System.out.println("eximido");    
        }
    }
}
