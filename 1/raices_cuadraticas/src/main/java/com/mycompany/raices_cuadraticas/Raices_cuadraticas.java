
package com.mycompany.raices_cuadraticas;

import java.util.Scanner;
/*Realizar un programa para el cálculo de las raíces de ecuación de segundo grado, el programa debe diferenciar entre las raíces imaginarias, raíces distintas, raíces iguales.*/

public class Raices_cuadraticas {

    public static void main(String[] args) {
        int a,b,c;
        double discriminante,x1,x2;
        
        Scanner sc= new Scanner (System.in);
        System.out.println("ingrese a");
        a = sc.nextInt();
        System.out.println("ingrese b");
        b = sc.nextInt();
        System.out.println("ingrese c");
        c = sc.nextInt();
        discriminante=b*b-4*a*c;
        
        if (discriminante>0){
           x1=(-b+Math.sqrt(discriminante))/(2*a);
           x2=(-b-Math.sqrt(discriminante))/(2*a);
           System.out.println("tiene 2 raices reales: x1 ="+x1+"x2="+x2);
        } else if (discriminante ==0)
        {
            x1 = -b/(2*a);
            System.out.println("tiene una raiz doble x1 = x2 ="+x1);
        } else {
            System.out.println("no tiene raices reales");
        }
    }
}
