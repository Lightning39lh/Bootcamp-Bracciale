/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spotify;

/**

 */
public class Usuarios {

    private String user;
    private String password;
    private boolean publicity=true;

    public Usuarios(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean havePublicity() {
        return publicity;
    }
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
