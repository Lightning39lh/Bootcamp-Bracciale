

package com.mycompany.minusculas;

/**
Realizar un programa que visualice por pantalla todos los caracteres correspondientes a letras minúsculas.
 */
public class Minusculas {

    public static void main(String[] args) {
        for(int i = 97; i <= 122; i++){
            
            System.out.print(Character.toChars(i));
        }
    }
}
