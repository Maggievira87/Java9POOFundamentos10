package Cafeteria;

public class Main {
    public static void main(String[] args) {


        Producto capuchino = new Producto("capuchino", 8500);
        Producto cafédeTostado = new Producto("cafédeTostado", 7000);
        Producto pasteldePolloTostado = new Producto("PasteldePolloTostado", 6000);


        Pedido p1 = new Pedido(1, capuchino, 2);
        Pedido p2 = new Pedido(2, cafédeTostado , 1);
        Pedido p3 = new Pedido(3, pasteldePolloTostado, 3);


        Cafeteria cafeteria = new Cafeteria("Cafeteria Maggie");


        cafeteria.agregarPedido(p1);
        cafeteria.agregarPedido(p2);
        cafeteria.agregarPedido(p3);


        p1.entregarPedido();
        p3.entregarPedido();


        cafeteria.mostrarPedidos();

        cafeteria.mostrarVentasTotales();


        System.out.println("\n===== Ventas por Producto =====");
        capuchino.mostrarInfo();
        cafédeTostado.mostrarInfo();
        pasteldePolloTostado.mostrarInfo();
    }
}

