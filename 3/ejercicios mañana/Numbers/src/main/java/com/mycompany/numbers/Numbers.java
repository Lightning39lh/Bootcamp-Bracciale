/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numbers;

import java.util.Scanner;

/**
Se quiere simular un juego en el que participan N jugadores y otra persona que hace de árbitro. Cada jugador elige 4 números en el rango [1, 10], pudiendo estar repetidos. 
* A continuación, el árbitro, sin conocer los números que ha elegido cada jugador, selecciona 2 números A y B.
El programa debe ser capaz de calcular cuántos números de los seleccionados por cada jugador están comprendidos entre los valores A y B. 
* Ganará el jugador que más números tenga en dicho intervalo.
Se pide implementar un programa modular que simule el juego para 3 jugadores, teniendo en cuenta que:
Tanto los 4 datos de cada jugador, como los valores para A y B se introducirán por teclado.
* En todos los casos, el programa detectará la entrada de números erróneos, solicitando nuevamente el dato hasta que sea válido.
Se deben mostrar por pantalla no solo los aciertos de cada jugador sino los datos que ha introducido cada jugador y los que ha seleccionado el árbitro. 
* Por último, hay que imprimir la media aritmética de los aciertos de todos los jugadores

 */
public class Numbers {

    public static void main(String[] args) {
    
        int p1[] = new int[4];
        int p2[] = new int[4];
        int p3[] = new int[4];
        double p1points = 0;
        double p2points = 0;
        double p3points = 0;
        int a, b;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number to compare: ");
        a = validatedNumber();
        System.out.println("enter the second number to compare: ");
        b = validatedNumber();
        for (int i = 0; i < 4; i++) //with more time i will do a class of persons with the array of int and the points
        {
            System.out.println("Player 1 enter the number: ");
            p1[i] = validatedNumber();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Player 2 enter the number: ");
            p2[i] = validatedNumber();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Player 3 enter the number: ");
            p3[i] = validatedNumber();
        }
        

        System.out.println("Player 1: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("The number "+ (i+1) + " is :"+p1[i]);
            if ((p1[i] < a && p1[i] > b) || (p1[i] > a && p1[i] < b)) {
                
                p1points++;
            }
        }
        System.out.println("Player 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("The number "+ (i+1) + " is :"+p2[i]);
            if ((p2[i] < a && p2[i] > b) || (p2[i] > a && p2[i] < b)) {               
                p2points++;
            }
        }
        System.out.println("Player 3: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("The number "+ (i+1) + " is :"+p3[i]);
            if ((p3[i] <= a && p3[i] >= b) || (p3[i] >= a && p3[i] <= b)) {
                p3points++;
            }
        }
        System.out.println("The numbers were: " + a + " and " + b);
        System.out.println("The player 1 average is: " + (p1points / 4));
        System.out.println("The player 2 average is: " + p2points / 4);
        System.out.println("The player 3 average is: " + p3points / 4);
        
    }

    private static int validatedNumber() {
        boolean flag =false;
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            num = sc.nextInt();
            if ((num >=0) && (num <=10)) {
                flag=true;
            } else System.out.println("incorrect number, enter the number again");
        }while (flag==false);
        return num;
    }
    
}

		
	