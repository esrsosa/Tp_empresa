/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_empresa;

/**
 *
 * @author Emanuel Sosa
 */
public class Empleado {
    private int dni;
    private String nombreApellido;
    private String categoria;
    private double sueldo;
    private Empresa empresa;

    public Empleado(int dni, String nombreApellido, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    
}
