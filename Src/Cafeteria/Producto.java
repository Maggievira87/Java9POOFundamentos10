package Cafeteria;

public class Producto {
    String nombre;
    double precio;
    int cantidadVendida;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendida = 0;
    }


    public void registrarVenta() {
        cantidadVendida++;
    }


    public void mostrarInfo() {
        System.out.println("Producto: " + nombre +
                " | Precio: $" + precio +
                " | Vendidos: " + cantidadVendida);
    }
}


