package Cafeteria;

public class Pedido {
    int id;
    Producto producto;
    int cantidadComprada;
    boolean entregado;


    public Pedido(int id, Producto producto, int cantidadComprada) {
        this.id = id;
        this.producto = producto;
        this.cantidadComprada = cantidadComprada;
        this.entregado = false;
    }


    public void entregarPedido() {
        if (!entregado) {
            entregado = true;


            for (int i = 0; i < cantidadComprada; i++) {
                producto.registrarVenta();
            }

            System.out.println("Pedido " + id + " fue entregado.");
        } else {
            System.out.println("Pedido " + id + " ya estaba entregado.");
        }
    }


    public double calcularTotal() {
        return producto.precio * cantidadComprada;
    }


    public void mostrarDetalle() {
        System.out.println("--- Detalle del Pedido ---");
        System.out.println("ID Pedido: " + id);
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Cantidad: " + cantidadComprada);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Entregado: " + (entregado ? "Sí" : "No"));
    }
}



