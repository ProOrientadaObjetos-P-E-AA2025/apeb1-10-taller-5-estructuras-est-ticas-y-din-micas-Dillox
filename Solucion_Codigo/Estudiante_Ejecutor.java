/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author santi
 */
public class Estudiante_Ejecutor {
    public static void main(String[] args) {
    Estudiante juan = new Estudiante("Juan", 18);
    Estudiante ana = new Estudiante("Ana", 19);
    
    Materia mateJuan = new Materia("Matemáticas", 2.5, 3.5, 3.0);
    Materia mateAna = new Materia("Matemáticas", 2.5, 2.0, 1.5);
    
    juan.asignarMateria(mateJuan);
    juan.mostrarEstado();

    ana.asignarMateria(mateAna);
    ana.mostrarEstado();
}

    
}
