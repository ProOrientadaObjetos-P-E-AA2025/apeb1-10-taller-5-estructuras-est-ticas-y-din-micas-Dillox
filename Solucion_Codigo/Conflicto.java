/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conflicto;
import java.util.ArrayList;
/**
 *
 * @author santi
 */
public class Conflicto {
    String nombre;
    String fechaInicio;
    String estado;
    String detalle;
    ArrayList<Pais> paises;
    ArrayList<Evento> eventos;

    public Conflicto(String nombre, String fechaInicio, String detalle) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.detalle = detalle;
        this.estado = "";
        this.paises = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarPais(Pais pais) {
        paises.add(pais);
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
        evaluarEstado(evento);
    }

    private void evaluarEstado(Evento evento) {
        int totalPaises = 195;
        int paisesConBatalla = 0;
        boolean batallaNuclear = false;

        for (Evento e : eventos) {
            if (e.esBatalla()) {
                for (Pais p : paises) {
                    if (p.nombre.equalsIgnoreCase(e.ubicacion)) {
                        paisesConBatalla++;
                        if (p.esDesarrollado && e.armasNucleares) {
                            batallaNuclear = true;
                        }
                    }
                }
            }
        }

        if ((double) paisesConBatalla / totalPaises >= 0.5 || batallaNuclear) {
            estado = "Guerra mundial";
        } else if ((double) paisesConBatalla / totalPaises >= 0.3) {
            estado = "Reunión urgente ONU";
        }

        for (Pais p : paises) {
            if (p.tieneBajasGraves()) {
                estado = "Reunión urgente ONU";
            }
        }
    }

    public void mostrarResumen() {
        System.out.println("Conflicto: " + nombre);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Estado: " + estado);
        System.out.println("Detalle: " + detalle);
        System.out.println("Países involucrados:");
        for (Pais p : paises) {
            System.out.println("- " + p.nombre + " | Desarrollado: " + p.esDesarrollado + " | Bajas: " + p.bajas);
        }
        System.out.println("Eventos:");
        for (Evento e : eventos) {
            System.out.println("* " + e);
        }
    }
}

