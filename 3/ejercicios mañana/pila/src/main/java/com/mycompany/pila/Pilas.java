
package com.mycompany.pila;

/**
 Crear un programa para implementa una pila utilizando una lista enlazada como estructura de datos, Dicha pila deberá almacenar cualquier tipo de objeto, y deberás implementar métodos para ellos como por ejemplo:

Insertar un objeto en la pila (push).
Recuperar un objeto de la pila (pop).
Obtener el objeto de la cima (top) de la pila, sin extraerlo.
Averiguar si hay algún objeto almacenado en la pila.
Devolver el número de objetos almacenados en la pila.

 */
public class Pilas {
    private int top = -1;
    private Object s[];
    private int max = 0;

    public Pilas(int max) {
        this.max = max;
        s=new Object[max];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public void push (Object o){
        if (!isFull()) {
            s[top]=o;
        }
    }

    private boolean isFull() {
        return top == max-1;
    }
    public Object pop(){
        Object aux;
        
        if (isEmpty()) return null;
        aux = s[top];
        s[top--]=null;
        return aux;
    }
    public Object get(){
       if (isEmpty()) {
           return null;
       }
       else return s[top]; 
    }
    public int amountObj(){
        return top+1;
    }
    
    //Construir una función que imprima los elementos de una lista enlazada de enteros en orden inverso a partir de una posición p

    public void printInverse(int top)
    {
        this.top=top;
        do
        {
            System.out.println("the object in the "+this.top+" is "+s[this.top]);
            this.top--;
        }while (!isEmpty());
    }
    
}
