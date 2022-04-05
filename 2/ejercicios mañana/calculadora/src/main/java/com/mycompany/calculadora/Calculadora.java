
package com.mycompany.calculadora;

import java.util.Scanner;

/*Realizar un programa que simule una calculadora, donde realice las operaciones básicas (suma, resta, multiplicación, división), 
el usuario debe primero ingresar dos valores, y especificar con un carácter la operación a realizar, para el uso del ejercicio debe usar la sentencia switch.*/

public class Calculadora {

    public static void main(String[] args) {
      
        char option;
        int num1,num2;
        Scanner sc= new Scanner (System.in);
        System.out.println("number 1:");
        num1 = sc.nextInt();
        System.out.println("number 2:");
        num2 = sc.nextInt();
        
        
        do {
            System.out.println("press * to multiplication");
            System.out.println("press + to sum");
            System.out.println("press - to subtraction");
            System.out.println("press / to division");
            System.out.println("press E to exit");
            
            option = sc.next().charAt(0);
            switch (option){
            case '*': {
                 System.out.println("the result is: "+multiplication(num1,num2));
                break;
            }
            case '+': {
                System.out.println("the result is: "+sum(num1,num2));
                break;
            }
            case '-':{
                System.out.println("the result is: "+subtraction(num1,num2));
                break;
            }
            case '/':{
                System.out.println("the result is: "+division(num1,num2));
                break;
            }
            case 'E': {
                System.out.println("thanks for using the calculator\n");
                break;
            }
            
            default:  {                       
                System.out.println("incorrect character, try again\n");}
             } 
        }while (option != 'E');
    }
    
     private static int multiplication(int num1, int num2) {
        return (num1*num2);
    }

   

    private static int sum(int num1, int num2) {
       return (num1+num2);
    }

    private static int subtraction(int num1, int num2) {
       return (num1-num2);
    }

    private static double division(int num1, int num2) {
        return (num1/num2);
    }

}

