/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

/**
 *
 * @author santi
 */
public class Estudiante {
    public static void main(String[] args){
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nom, int edad) {
        this.nombre = nom;
        this.edad = edad;        
    }

    public void asignarMateria(Materia materia) {
        this.materia = materia;
    }

    void mostrarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}


    

