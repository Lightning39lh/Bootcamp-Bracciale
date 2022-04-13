/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author M_Her
 */
public class Persona {
    private static int idInfo;
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private LocalDate  fechaNacimiento;
    private Date  fechaNacimientoSQL;
    
    public Persona(String nombre, String apellido, int dni, String direccion, int dia, int mes, int anio) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = LocalDate.of(anio,dia,mes);
        this.fechaNacimientoSQL = fechaNacimientoSQL.valueOf(fechaNacimiento);
	idInfo++;
	id = idInfo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public static int getIdInfo() {
        return idInfo;
    }
    public static void setIdInfo(int idInfo) {
        Persona.idInfo = idInfo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimientoSQL() {
        return fechaNacimientoSQL;
    }

    public void setFechaNacimientoSQL(Date fechaNacimientoSQL) {
        this.fechaNacimientoSQL = fechaNacimientoSQL;
    }
    
    
}
