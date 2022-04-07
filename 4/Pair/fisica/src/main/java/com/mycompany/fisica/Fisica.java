
package com.mycompany.fisica;

import java.util.Scanner;

/**

 */
public class Fisica {

    public static void main(String[] args) {
        var a0 =0;
        var v0 =0;
        var x0 =0;
        var t =0;
        var xf =0;
        var vf =0;
        var despPromedio =0;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la aceleracion inicial");
        a0= sc.nextInt();
        System.out.println("ingrese la velocidad inicial");
        v0= sc.nextInt();
        System.out.println("ingrese la pocision inicial");
        x0= sc.nextInt();
        System.out.println("ingrese la cantidad de tiempo en segundos");
        t= sc.nextInt();
        
        xf=x0+v0*t+(1/2)*a0*t*t;
        vf=v0*t+a0;
        despPromedio=xf/t;
        
        System.out.println("el despazamiento final es: "+xf);
        System.out.println("velocidad final es: "+vf);
        System.out.println("el despazamiento promedio es: "+despPromedio); //termino dejandomelo como int
        
        
        
        
    }
}
