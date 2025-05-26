/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;

/**
 *
 * @author santi
 */
public class Materia {
    public String nombre;
    public double nota1;
    public double nota2;
    public double nota3;

    public Materia(String nom, double nota1, double nota2, double nota3) {
        this.nombre = nom;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double obtenerNotaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean estaAprobado() {
        double notaFinal = obtenerNotaFinal();
        return notaFinal >= 7;
    }

    public double calcularRecuperacion(double notaRecuperacion) {
        double acumulado = obtenerNotaFinal() * 0.6;
        return acumulado + notaRecuperacion;
    }
}

    

