
package com.mycompany.ejprimos;

import java.util.Scanner;

public class Ejprimos {

    public static void main(String[] args) {
        
    }

    public static boolean isPrimeIf()
    {

        Scanner scan = new Scanner(System.in);
        int number;

        do 
        { // do while because i need to check that is a number between 1 and 14

        System.out.println(" \n Enter a number beetwen 1 and 14: ");
        number = scan.nextInt();

        if(number >14 &&  number < 1)
            System.out.println("that number doesn't respect the conditions ");

        }while (number >14 && number < 1);

        if (number == 1) //this number isn't prime, but it's  only divisible between 1 and themself
         {
                return false;
         }
         for(int i = 2; i<number; i++) 
         {
             if(number%i == 0) //here I look if they are divisible by a number between 2 and the number
             {
                 return false;
             }
         }

        return true;
    }
    
    public static boolean EsPrimoSwitch(int i){
        switch (i) { //no hace falta el break xq sale de la funcion por el return
            case 2:
            case 3:
            case 5: 
            case 7: 
            case 11: 
            case 13: return true;
            default:
                return false;
        }
    }
}
