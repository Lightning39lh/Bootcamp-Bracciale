

package com.mycompany.temperatura;

import java.util.Scanner;

/**

 */
public class Temperatura {

    public static void main(String[] args) {
        /*
            Digitar la temepratura del día cada 4 horas del día: 
            - Temperatura promedio
            - Temperatura maxima
            - Temperatura minima
        */
        int[] temperatura = new int[6];

        Scanner scan = new Scanner(System.in);


        for(int i = 0; i < 24; i+=4){
            System.out.println("Ingrese la temperatura  de las "+i+": ");
            temperatura[i/4] = scan.nextInt();

        }

        scan.close();
        muestraMaxima(temperatura);
        muestraMinima(temperatura);
        
       // System.out.println("la temperatura minima es: "+buscaMinima(temperatura));
      //  System.out.println("la hora de la temperatura minima es: "+horaTempMinima(temperatura));

        
    }
    
  /*   private static int buscaMaxima(int[] temperatura) {
        int temperaturaMax = temperatura[0];
        for(int i = 1; i < 6; i++){
            if(temperatura[i] > temperaturaMax){
                temperaturaMax = temperatura[i];
            }
          }
        return temperaturaMax;
        }
     
     private static int buscaMinima(int[] temperatura) {
        int temperaturaMin = temperatura[0];
        for(int i = 1; i < 6; i++){
            if(temperatura[i] < temperaturaMin) {
                temperaturaMin = temperatura[i];
            }
            
        }
        return temperaturaMin;
        }

    private static int horaTempMaxima(int[] temperatura) {
        int temperaturaMax = temperatura[0];
        int horaMax=0;
        for(int i = 1; i < 6; i++){
            if(temperatura[i] > temperaturaMax) {
                horaMax=i;
                temperaturaMax = temperatura[i];
            }
            
        }
        return horaMax*4;
    }

    private static int horaTempMinima(int[] temperatura) {
        int temperaturaMin = temperatura[0];
        int horaMin=0;
        for(int i = 1; i < 6; i++){
            if(temperatura[i] < temperaturaMin) {
                horaMin=i;
                temperaturaMin = temperatura[i];
            }
            
        }
        return horaMin*4;
    }
*/
    private static void muestraMaxima(int[] temperatura) {
        int temperaturaMax = temperatura[0];
        int horaMax=0;
        for(int i = 1; i < 6; i++){
            if(temperatura[i] > temperaturaMax) {
                horaMax=i;
                temperaturaMax = temperatura[i];
            }
        }
        System.out.println("la temperatura maxima es: "+temperaturaMax);
        System.out.println("la hora de la temperatura maxima es: "+horaMax*4);
    }

    private static void muestraMinima(int[] temperatura) {
        int temperaturaMin = temperatura[0];
        int horaMin=0;
        for(int i = 1; i < 6; i++){
            if(temperatura[i] < temperaturaMin) {
                horaMin=i;
                temperaturaMin = temperatura[i];
            }            
        }
       System.out.println("la temperatura maxima es: "+temperaturaMin);
       System.out.println("la hora de la temperatura maxima es: "+horaMin*4);
    }
         
}
       
        
