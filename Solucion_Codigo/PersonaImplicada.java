/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corrupcion;

/**
 *
 * @author santi
 */
public class PersonaImplicada {
    public String nombre;
    public int edad;
    public String ocupacion;
    public String nivelImplicacion;
    public boolean colabora;
    public double anosSentencia;
    public double danoEconomico;

    public PersonaImplicada(String nombre, int edad, String ocupacion, String nivelImplicacion, boolean colabora, double anosSentencia, double danoEconomico) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colabora = colabora;
        this.anosSentencia = anosSentencia;
        this.danoEconomico = danoEconomico;
    }

    public boolean puedeReducirPena() {
        return nivelImplicacion.equalsIgnoreCase("acusado") && colabora;
    }

    public boolean puedePagarFianza() {
        return nivelImplicacion.equalsIgnoreCase("acusado") && colabora && anosSentencia < 1;
    }

    public double calcularFianza() {
        if (puedePagarFianza()) {
            return danoEconomico * 0.5;
        }
        return 0;
    }

    public String toString() {
        String resultado = "Nombre: " + nombre + ", edad: " + edad + ", ocupación: " + ocupacion + ", nivel: " + nivelImplicacion;
        if (puedeReducirPena()) {
            resultado += " (Solicita reducción de pena)";
        }
        if (puedePagarFianza()) {
            resultado += " (Puede pagar fianza de $" + calcularFianza() + ")";
        }
        return resultado;
    }
}
