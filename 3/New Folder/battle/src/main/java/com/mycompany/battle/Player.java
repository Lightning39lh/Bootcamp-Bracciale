/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battle;

/**
 
 */
public class Player {

   private String name;
    private int coins;
    private Unit unit;

    public Player(String name){
        this.name = name;
        this.coins = 10;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCoins() {
        return coins;
    }
    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Unit getUnit() {
        return unit;
    }
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void view(){
        System.out.println("Player:"+
                         "\nname:" + name +
                         "\nCoins:" + coins );
        this.unit.view();
    }


    
}
