package com.mycompany.arreglo10;

import java.util.Arrays;
import java.util.Scanner;

/*
Realizar un programa que permita ingresar por teclado 10 números en un arreglo y debe:

Mostrar el número mayor
Mostrar el número menor
Mostrar los números pares
Mostrar los números impares
Ordenarlos de manera Ascendente
Ordenarlos de manera Descendente

 */
public class Arreglo10 {

    public static void main(String[] args) {
        int [] array10 = new int [10];
         Scanner sc= new Scanner (System.in);
        
        for (int i =0; i<10; i++ ){
            System.out.println("number "+i+":");
        array10[i] = sc.nextInt();
        }
        printHigher(array10);
        printLower(array10);
        printEven(array10);
        printOdd(array10);
        array10= sortAsc(array10);
        printarray10(array10);//to print asc
        array10= sortDesc(array10);
        printarray10(array10);// to print desc
        
    }

    private static void printHigher(int[] array10) {
        int higher= array10[0];
        for (int i =1; i<10; i++ ){
            if (higher<array10[i])
            {
                higher= array10[i];
            }
        }
        System.out.println("the higher number is "+higher);
    }

    private static void printLower(int[] array10) {
        int lower= array10[0];
        for (int i =1; i<10; i++ ){
            if (lower>array10[i])
            {
                lower= array10[i];
            }
        }
        System.out.println("the higher number is "+lower);
    }

    private static void printEven(int[] array10) {
        System.out.println("the even numbers are :");
        for (int i =0; i<10; i++ ){
            if (array10[i]%2==0)
            {
                System.out.println(array10[i]);
            }
        }
    }

    private static void printOdd(int[] array10) {
        System.out.println("the odd numbers are :");
        for (int i =0; i<10; i++ ){
            if (array10[i]%2!=0)
            {
                System.out.println(array10[i]);
            }
        }
    }

    private static int[] sortAsc(int[] array10) {
        int temp;
        for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) { 
                if (array10[i] > array10[j]) 
                {
                    temp = array10[i];
                    array10[i] = array10[j];
                    array10[j] = temp;
                }
            }
        }
        //Arrays.sort(array10);
        return array10;
        
    }

    private static int[] sortDesc(int[] array10) {
        int temp;
        for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 10; j++) { 
                if (array10[i] < array10[j]) 
                {
                    temp = array10[i];
                    array10[i] = array10[j];
                    array10[j] = temp;
                }
            }
        }
        return array10;
        
    }

    private static void printarray10(int[] array10) {
        System.out.println("array: \n");
        for (int i =0; i<10; i++ ){
                System.out.println(array10[i]);
        }
    }
    
    
    
    
    
    
}
