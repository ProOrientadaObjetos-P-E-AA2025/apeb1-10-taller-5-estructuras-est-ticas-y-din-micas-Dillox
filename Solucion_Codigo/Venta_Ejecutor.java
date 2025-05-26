/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1_carrito_de_compras;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Venta_Ejecutor {
    public static void main(String[] args){
    ArrayList<Producto> tienda = new ArrayList<>();
    P1_Carrito_de_compras carrito = new P1_Carrito_de_compras();
    
    tienda.add(new Producto("Cebolla", 1, 300));
    tienda.add(new Producto("Piña", 2, 600));
    tienda.add(new Producto("Chuleta", 100, 50));
    tienda.add(new Producto("Media Luna", 3, 100));
    tienda.add(new Producto("Manzana Verde", 1, 200));
    
    carrito.aggProducto("Chuleta", 7, tienda);
    carrito.aggProducto("Manzana verde", 4, tienda);
    carrito.aggProducto("Piña", 20, tienda);
 
    carrito.mostrar_detalles();
    
    double total = carrito.Calcular_total();
    System.out.println("Total calculado: $"+ total);

    double pago_cliente = 6000;
    double desc = 10;
    System.out.println("Monto pagado: $"+ pago_cliente);
    System.out.println("Descuento del " + desc+ "% si aplica");
    carrito.pago(pago_cliente,desc,tienda);
    
    }
}
