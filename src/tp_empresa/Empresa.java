/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_empresa;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Sosa
 */
public class Empresa {

    private String razonSocia;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocia, int cuit, ArrayList<Empleado> empleados) {
        this.razonSocia = razonSocia;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    public String getRazonSocia() {
        return razonSocia;
    }

    public void setRazonSocia(String razonSocia) {
        this.razonSocia = razonSocia;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    private void mostrarEmpleados() {
        
    }

    private void agregarEmpleados(Empleado e) {
        
    }
}
