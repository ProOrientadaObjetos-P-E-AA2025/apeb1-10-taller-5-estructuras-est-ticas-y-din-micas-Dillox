/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departamento;

/**
 *
 * @author santi
 */
public class Empresa {
    String nombre;
    String ruc;
    String direccion;
    Departamento[] departamentos;

    public Empresa(String nombre, String ruc, String direccion, Departamento[] departamentos) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamentos = departamentos;
    }

    public void mostrarDepartamentos() {
        System.out.println("Empresa: " + nombre);
        System.out.println("RUC: " + ruc);
        System.out.println("Dirección: " + direccion);
        System.out.println("Departamentos:");
        for (Departamento d : departamentos) {
            System.out.println(d);
        }
    }
}

    

