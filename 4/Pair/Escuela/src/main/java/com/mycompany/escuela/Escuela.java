/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.escuela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M_Her
 */
public class Escuela {

    public static void main(String[] args) {
        
        char option;
        Scanner sc = new Scanner(System.in);
        ArrayList <Alumno> alumnos = new ArrayList();
        String nombre,apellido;
        
        int i=1;
        do{
            System.out.println("ingrese el nombre y apellido del alumno "+i);
            nombre = sc.nextLine();
            apellido = sc.nextLine();
            Alumno alumno = new Alumno(nombre,apellido);
            alumnos.add(alumno); 
            System.out.println("desea ingresar otro alumno? (N para salir)");
            option = sc.next().charAt(0);
            sc.nextLine();
            i++;
            
        } while (option !='N');
        
        for (i =0; i<alumnos.size();i++)
        {
            do  {
            System.out.println("ingrese la nota del alumno"+(i+1));
            alumnos.get(i).addNota(sc.nextInt());
            System.out.println("desea ingresar otra nota? (S para seguir, N para salir)");
            option = sc.next().charAt(0);
            } while (option !='N');    
        } 
        
        for (i =0; i<alumnos.size();i++){
        System.out.println("el alumno: "+alumnos.get(i).getNombreCompleto()+" "+alumnos.get(i).clasificaPromedio()+" con un promedio de "+alumnos.get(i).calculaPromedio());
        }
        
        
        
        
    }
}
