/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sumarecursiva;

import java.util.ArrayList;

/**
 
 */
public class SumaRecursiva {

    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(30);
      numbers.add(45);
      numbers.add(20);
      System.out.println("the sum of the list is: "+recursiveAdd(numbers,numbers.size()-1));
    }

    private static Integer recursiveAdd(ArrayList<Integer> numbers,int i) {
        if (i<0) {
            return 0;
        }
        else return numbers.get(i)+recursiveAdd(numbers,i-1);
        
    }
  
            
}
