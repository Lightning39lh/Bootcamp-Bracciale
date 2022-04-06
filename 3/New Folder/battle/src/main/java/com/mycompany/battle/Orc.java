
package com.mycompany.battle;

/**

 */
public class Orc extends Unit{

     public Orc (){
        super.life = 150;
        super.atk = 100;
        super.prob = 30 ;
    }

    public int attack(){
        if((int) (Math.random() *100+1) <= this.prob){
            this.life = this.life + 15;
            return this.atk;
        }else{
            return 0;
        }
    }
    
    
}
