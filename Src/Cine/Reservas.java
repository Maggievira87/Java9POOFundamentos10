package Cine;

public class Reservas {

    Pelicula pelicula;

    Sala sala;

    String cliente;

    public Reservas(Pelicula pelicula,Sala sala, String cliente){
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    public void procesarReserva() {
        boolean entradaVendida = pelicula.venderEntradas();
        boolean asientoOcupado = sala.ocuparAsiento();

        if (entradaVendida && asientoOcupado) {
            System.out.println("Reserva exitosa para: " + cliente);
        } else {
            System.out.println("La reserva NO pudo completarse para:" + cliente);
        }
    }

    public void mostrarDetalles() {
        System.out.println("----- RESERVA -----");
        System.out.println("Cliente: " + cliente);
        System.out.println("Película: " + pelicula.titulo);
        System.out.println("Sala: " + sala.idSala);

    }
}
