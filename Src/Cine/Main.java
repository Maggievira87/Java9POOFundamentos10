package Cine;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula(
                "Zootopia2",
                "Familia",
                107,
                5
        );

        Sala sala = new Sala(
                "Sala 1",
                "3D",
                5,
                0
        );


        Reservas r1 = new Reservas(pelicula1, sala, "Zoe Parra");
        Reservas r2 = new Reservas(pelicula1, sala, "Laura Rojas");
        Reservas r3 = new Reservas(pelicula1, sala, "Juan Gonzalez");
        Reservas r4 = new Reservas(pelicula1, sala, "Nathalia Paris");
        Reservas r5 = new Reservas(pelicula1, sala, "Camilo Castiblanco");
        Reservas r6 = new Reservas(pelicula1, sala, "Juan Pablo llanos");


        r1.procesarReserva();
        r2.procesarReserva();
        r3.procesarReserva();
        r4.procesarReserva();
        r5.procesarReserva();
        r6.procesarReserva();


        System.out.println("\n===== INFORMACIÓN FINAL =====");

        System.out.println("\n--- Película actualizada ---");
        pelicula1.mostrarInformacion();

        System.out.println("\n--- Sala actualizada ---");
        sala.mostrarEstado();

        System.out.println("\n--- Detalles de cada reserva ---");
        r1.mostrarDetalles();
        r2.mostrarDetalles();
        r3.mostrarDetalles();
        r4.mostrarDetalles();
        r5.mostrarDetalles();
        r6.mostrarDetalles();
    }
}