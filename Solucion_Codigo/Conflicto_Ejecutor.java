/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conflicto;

/**
 *
 * @author santi
 */
public class Conflicto_Ejecutor {
    public static void main(String[] args) {
        Conflicto conflicto = new Conflicto("Conflicto Regional", "2025", "Disputa territorial entre países vecinos");
        
        Pais argentina = new Pais("Argentina", false, 120000);
        Pais chile = new Pais("Chile", false, 80000);
        Pais brasil = new Pais("Brasil", true, 300000);
        Pais paraguay = new Pais("Paraguay", false, 25000);

        conflicto.agregarPais(argentina);
        conflicto.agregarPais(chile);
        conflicto.agregarPais(brasil);
        conflicto.agregarPais(paraguay);

        Evento batallaCordillera = new Evento("Batalla Cordillera", "2025/03/15", "Chile", "batalla", "Enfrentamiento en la zona montañosa", false);
        Evento negociacionFallida = new Evento("Negociación Fallida", "2025/06/05", "Argentina", "diplomacia", "No se llegó a un acuerdo de paz", false);
        Evento movilizacionEjercito = new Evento("Movilización del Ejército", "2025/07/10", "Brasil", "batalla", "Ejército se prepara para posible conflicto", false);

        chile.registrarBajas(90000);
        brasil.registrarBajas(150000);

        conflicto.agregarEvento(batallaCordillera);
        conflicto.agregarEvento(negociacionFallida);
        conflicto.agregarEvento(movilizacionEjercito);

        conflicto.mostrarResumen();
    }
}
