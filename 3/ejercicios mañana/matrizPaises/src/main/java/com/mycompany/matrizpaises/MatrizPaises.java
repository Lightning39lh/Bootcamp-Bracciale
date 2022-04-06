package com.mycompany.matrizpaises;

import java.util.Scanner;

/**
Crea un programa que pida por pantalla cinco países y a continuación tres ciudades de cada uno de estos países. 
Los nombres de ciudades deben almacenarse en un array multidimensional cuyo primer índice sea el número asignado a cada país y el segundo índice el número asignado a cada ciudad,
mostrar por pantalla el resultado.
 */
public class MatrizPaises {

    public static void main(String[] args) {
        String [] countryNames = new String [5];
        String [][] cityNames = new String [5][3];
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<5;i++){
            System.out.println("enter the country "+(i+1));
            countryNames[i]= sc.nextLine();
        }
        
        for (int i =0; i<5;i++){
            for (int j=0;j<3;j++){
                System.out.println("enter the city "+(j+1)+" of the country "+countryNames[i]);
            cityNames[i][j]= sc.nextLine();
            }
        }
        
        for (int i =0; i<5;i++){
             System.out.println("the city in the country "+countryNames[i]+" are: ");
            for (int j=0;j<3;j++){
               System.out.println(cityNames[i][j]);
            }
        }
        
        
        
        
        
    }
}
