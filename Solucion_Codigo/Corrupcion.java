/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package corrupcion;
import java.util.ArrayList;
/**
 *
 * @author santi
 */
public class Corrupcion {

    public String nombre;
    public String fechaInicio;
    public String estado;
    public String detalle;
    ArrayList<PersonaImplicada> personas;

    public Corrupcion(String nombre, String fechaInicio, String detalle) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.detalle = detalle;
        this.estado = "";
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(PersonaImplicada persona) {
        personas.add(persona);
    }

    public void actualizarEstado(int dias) {
        if (dias > 14) {
            estado = "Urgente";
        } else if (dias > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    public void mostrarInformacion(int dias) {
        actualizarEstado(dias);
        System.out.println("Caso: " + nombre);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Estado: " + estado);
        System.out.println("Detalles: " + detalle);
        System.out.println("\nPersonas implicadas:");
        for (PersonaImplicada p : personas) {
            System.out.println("- " + p);
        }
    }
}
