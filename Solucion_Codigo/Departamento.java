/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package departamento;

/**
 *
 * @author santi
 */
public class Departamento {
    public String nombre;
    public int empleados;
    public double produccion;
    public String categoria;

    public Departamento(String nombre, int empleados, double produccion) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.produccion = produccion;
        asignarCategoria();
    }

    private void asignarCategoria() {
        if (empleados > 20 && produccion > 1000000) {
            categoria = "A";
        } else if (empleados >= 20 && produccion >= 1000000) {
            categoria = "B";
        } else if (empleados >= 10 && produccion >= 500000) {
            categoria = "C";
        } else {
            categoria = "Sin categoría";
        }
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre +
               "\nEmpleados: " + empleados +
               "\nProducción anual: $" + produccion +
               "\nCategoría: " + categoria + "\n";
    }
}

    

