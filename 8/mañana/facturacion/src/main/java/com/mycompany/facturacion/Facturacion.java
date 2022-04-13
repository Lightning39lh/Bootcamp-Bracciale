

package com.mycompany.facturacion;

import database.dbController;
import model.Cliente;

/**

 */
public class Facturacion {

    public static void main(String[] args) {
      dbController dbc = new dbController();
      Cliente cliente = new Cliente("Juan", "Perez", "jara 230", 37867870, 01, 11, 1993);
      dbc.insertCliente(cliente);
      dbc.selectClientes();
      
    }
}
