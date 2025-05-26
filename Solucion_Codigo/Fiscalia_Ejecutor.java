/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corrupcion;

/**
 *
 * @author santi
 */
public class Fiscalia_Ejecutor {
    public static void main(String[] args) {
        Corrupcion caso = new Corrupcion("Caso 1024", "2025/04/10", "Malversación de fondos");

        PersonaImplicada ana = new PersonaImplicada("Ana Gómez", 45, "Contadora", "acusada", true, 0.7, 15000);
        PersonaImplicada juan = new PersonaImplicada("Juan Pérez", 38, "Testigo", "testigo", false, 0, 0);

        caso.agregarPersona(ana);
        caso.agregarPersona(juan);
        caso.mostrarInformacion(9);
    }
}
