
package com.mycompany.battle;

/**

 */
public class Elf extends Unit{
    
     public Elf (){
        super.life = 100;
        super.atk = 40;
        super.prob = 70;
    }

    public int attack(){
        if((int) (Math.random() *100+1) <= this.prob){
            this.prob = this.prob + 8;
            return this.atk;
        }else{
            return 0;
        }
    }
}
