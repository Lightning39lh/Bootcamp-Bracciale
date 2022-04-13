
package database;

import com.mysql.cj.xdevapi.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Cliente;

/**

 */
public class dbController {
    private Conection conection;

    private Connection con;
     
    public dbController(){
    	conection = new Conection();
    }
      
    public void insertCliente(Cliente cliente)    {
        PreparedStatement ps;
        PreparedStatement ps2;
        String sql;
    
       
        try{ //Save personal info
        	
         	Connection con = conection.getConnection();
            sql = "insert into person( idPerson, nombre, apellido, dni, direccion, fechaNacimiento) values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getDni());
            ps.setString(5, cliente.getDireccion());
            ps.setDate(6, cliente.getFechaNacimientoSQL());
            
            ps.executeUpdate();
            
            sql = "insert into Clientes( idClient, idInfo) values (?,?)";
            ps2 = con.prepareStatement(sql);
            ps2.setInt(1, cliente.getIdCliente());
            ps2.setInt(2, cliente.getId());
            
            ps2.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error:" + e.getMessage());
        }
        
        
        
    }
    
    public void selectClientes()   {
        	Connection con = conection.getConnection();
      
        	try
        	{
        		 
                   String sql = "select idCliente, nombre, apellido, dni from Cliente c inner join personaInfo p on c.idInfo = p.idInfo";
   		   PreparedStatement stmtt =  con.prepareStatement(sql);
   		   ResultSet rs = stmtt.executeQuery(sql);
   		   System.out.println("CLIENTES: : ");
   		   while (rs.next()) {
   			
   		   System.out.println("Id: " + rs.getInt("idClient")+ ", nombre: " + rs.getString("nombre") + " " + rs.getString("apellido") +", DNI: "+rs.getString("dni") );
   		}
   		  
   		  rs.close();
                stmtt.close();
   		}
   		catch (SQLException e) {
   		}
        }
    
    public void updatePerson(int idPersona, String nombre, String apellido, int dni, String direccion, Date fechaNacimiento) {
	Connection con = conection.getConnection();
            
        	try
        	{
        		 
     	   String sql = "Update personInfo  "
     	   		+ "SET nombre = " + nombre + ", apellido = " + apellido + ", dni = " +dni +", direccion = " + direccion + "fechaNacimiento = " + fechaNacimiento
     	   		+ "where idPerson = " +idPersona +";";
   		   PreparedStatement stmtt =  con.prepareStatement(sql);
   		   stmtt.executeUpdate();
   	
  
   		
   	stmtt.close();
   		}
   		catch (Exception e) {
   		  e.printStackTrace();
   		}
        }
    
    public void deletePerson(int idInfo)
        {
        	Connection con = conection.getConnection();
            
        	try
        	{
        		 
     	   String sql = "Delete from personaInfo where idInfo = " +idInfo +";";
   		   PreparedStatement stmtt =  con.prepareStatement(sql);
   		   stmtt.executeUpdate();
	
   	stmtt.close();
   		}
   		catch (SQLException e) {
   		  e.printStackTrace();
   		}
        }
    
    }

