

package com.mycompany.capicua;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        
        String cadena;
        Scanner sc;
        Boolean esCapicua=true;
        int aux=0;
        System.out.println("ingrese numero");
        sc = new Scanner (System.in);
        cadena= sc.nextLine();
        int [] numeros=new int[cadena.length()];
        for(int i=numeros.length-1;i>=0;i--){
        numeros[i]=Character.getNumericValue(cadena.charAt(i));
        }
        for(int i=(numeros.length-1);i>=0;i--){
            if (numeros[i] != numeros[aux])
            {
             esCapicua=false;   
            }
                    aux++;
        }
        if (esCapicua) {
            System.out.println("es capicua");
        } else {
            System.out.println("no es capicua");
        }
            
    }
}
