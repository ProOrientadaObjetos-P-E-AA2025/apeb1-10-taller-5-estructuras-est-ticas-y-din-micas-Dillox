/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conflicto;

/**
 *
 * @author santi
 */
public class Evento {
    String nombre;
    String fecha;
    String ubicacion;
    String tipo;  
    String descripcion;
    boolean armasNucleares;

    public Evento(String nombre, String fecha, String ubicacion, String tipo, String descripcion, boolean armasNucleares) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.armasNucleares = armasNucleares;
    }

    public boolean esBatalla() {
        return tipo.equalsIgnoreCase("batalla");
    }

    
    public String toString() {
        return nombre + " | " + fecha + " | " + ubicacion + " | " + tipo + " | " + descripcion + (armasNucleares ? " (armas nucleares)" : "");
    }
}
