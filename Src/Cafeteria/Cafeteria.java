package Cafeteria;// Solucion Taller

import java.util.ArrayList;

public class Cafeteria {
    String nombre;
    ArrayList<Pedido> listaPedidos;


    public Cafeteria(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
    }


    public void agregarPedido(Pedido p) {
        listaPedidos.add(p);
    }


    public void mostrarPedidos() {
        System.out.println("===== Pedidos Registrados =====");
        for (Pedido p : listaPedidos) {
            p.mostrarDetalle();
        }
    }


    public void mostrarVentasTotales() {
        double total = 0;

        for (Pedido p : listaPedidos) {
            if (p.entregado) {
                total += p.calcularTotal();
            }
        }

        System.out.println("\n Ventas Totales (solo pedidos entregados): $" + total);
    }
}


