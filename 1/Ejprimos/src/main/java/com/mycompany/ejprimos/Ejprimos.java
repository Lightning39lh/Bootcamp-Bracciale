
package com.mycompany.ejprimos;

public class Ejprimos {

    public static void main(String[] args) {
        
    }
    public static boolean EsPrimoIf(int i) {
    if (i == 1) {
        return true;
            } else if (i==2) {
                return true;
            } else if (i==3) {
                return true;
            } else if (i==5){
                return true;
            } else if (i==7){
                return true;
            } else if (i==7){
                return true;
            } else if (i==11){
                return true;
            } else if (i==13){
                return true;
            } else {
                return false;
            }    
}
    public static boolean EsPrimoSwitch(int i){
        switch (i) {
            case 1: return true; //no hace falta el break xq sale de la funcion por el return
            case 2: return true;
            case 3: return true;
            case 5: return true;
            case 7: return true;
            case 11: return true;
            case 13: return true;
            default:
                return false;
            
            
        }
    }
    
    
}
