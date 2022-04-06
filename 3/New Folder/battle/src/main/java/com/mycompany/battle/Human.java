
package com.mycompany.battle;

/**

 */
public class Human extends Unit{

    
    public Human(){
        super.life = 100;
        super.atk = 50 ;
        super.prob = 50;
    }

    public int attack(){
        int str=0;
        if ((int)(Math.random()*100+1)<= this.prob){
            str= this.atk;
            if ((int)(Math.random() * 100+1) <= 20){  //hit twice
                str= this.atk*2;
            }
        }
        return str;
    }
    
    
    
}
