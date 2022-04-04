
package com.mycompany.mayor_3;
/* Realizar un programa que indique el mayor de tres valores numéricos.

*/


import java.util.Scanner;


public class Mayor_3 {

    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc= new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        n1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = sc.nextInt();
        System.out.println("ingrese el tercer numero");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El mayor es: "+n1);                                             
            } else {
                System.out.println("el mayor es: "+n3);     
            }
        } else if (n2 > n3) {
            System.out.println("el mayor es: "+n2);
        } else {
            System.out.println("el mayor es: "+n3);
        }
    }
}
