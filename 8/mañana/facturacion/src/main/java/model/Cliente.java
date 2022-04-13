/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**

 */
public class Cliente extends Persona{

    private static int clienteId;
    private int idCliente;
    
    public static int getClienteId() {
        return clienteId;
    }

    public static void setClienteId(int clienteId) {
        Cliente.clienteId = clienteId;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente( String nombre, String apellido, String direccion, int dni, int dia, int mes, int anio) {
        super(nombre, apellido, dni, direccion, dia, mes, anio);
        clienteId++;
	idCliente = clienteId;
    }
    
}
