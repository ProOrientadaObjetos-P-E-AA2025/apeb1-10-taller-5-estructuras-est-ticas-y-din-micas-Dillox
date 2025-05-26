/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departamento;

/**
 *
 * @author santi
 */
public class Empresa_Ejecutor {
    public static void main(String[] args) {
        Departamento ventas = new Departamento("Ventas", 15, 750000);
        Departamento marketing = new Departamento("Marketing", 8, 1200000);
        
        Departamento[] departamentos = {ventas, marketing};
        
        Empresa empresa = new Empresa("Soluciones SA", "1234567890", "Quito", departamentos);
        
        empresa.mostrarDepartamentos();
    }
}

