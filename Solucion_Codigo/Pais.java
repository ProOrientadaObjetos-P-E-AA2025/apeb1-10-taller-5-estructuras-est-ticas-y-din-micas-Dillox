/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conflicto;

/**
 *
 * @author santi
 */
public class Pais {
    String nombre;
    boolean esDesarrollado;
    int bajas;

    public Pais(String nombre, boolean esDesarrollado, int bajas) {
        this.nombre = nombre;
        this.esDesarrollado = esDesarrollado;
        this.bajas = bajas;
    }

    public void registrarBajas(int numero) {
        this.bajas += numero;
    }

    public boolean tieneBajasGraves() {
        return bajas > 100000;
    }

    public String toString() {
        return nombre + " (Desarrollado: " + esDesarrollado + ", Bajas: " + bajas + ")";
    }
}
