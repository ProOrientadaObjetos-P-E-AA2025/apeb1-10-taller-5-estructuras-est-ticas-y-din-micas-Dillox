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

public class p1_carrito_de_compras {
    
    ArrayList<Producto> carrito = new ArrayList<>();;  
        
    
    
    public void agregarProducto(String nom, int cant, ArrayList<Producto>tienda){
       for(Producto p : tienda){
           if(p.nom.equalsIgnoreCase(nom)){
                if (cant <= p.cant){
                    carrito.add(new Producto(p.nom, p.pre, cant));
                    System.out.println("Producto agregado");
                }else{
                    System.out.println("Cantidad no disponible");
                }
                return;
            }
        } 
        System.out.println("Producto no encontrado");
    }
    public double Calcular_total(){
        double total = 0;
        for(Producto p : carrito){
            total += p.pre*p.cant;
        }
        return total;
    }
    public void pago(double montopagado, double desc, ArrayList<Producto>tienda){
        double total = Calcular_total();
        if (montopagado > 1000){
            total -= total*(descuento/100);
        }
        if (montopagado >= total){
            for( Producto cantp : carrito){
                for(Producto totp : carrito){
                    if(cantp.nom.equalsIgnoreCase(totp.nom)){
                        totp.cant = totp.cant - cantp.cant;
                    }                    
                }
            }
            System.out.println("Pago realizado con exito, gracias por su compra");           
        }else{
            System.out.println("Monto insuficiente");
        }        
    }
    public void mostrar_detalles(){
        if(carrito.isEmpty()){
            System.out.println("El carrito esta vacio");
            return;
        }
        System.out.println("Productos en el carrito:");
        for(Producto p: carrito){
            System.out.println("* " +p.nom+" - "+p.cant+" $"+p.pre);
        }
    }
    
}

}
