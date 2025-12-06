package Cine;

public class Pelicula {

    String titulo;
    String genero;
    int duracion;
    int entradasDisponibles;

    public Pelicula(String titulo, String genero, int duracion, int entradasDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.entradasDisponibles = entradasDisponibles;
    }

    public boolean venderEntradas() {
        if (entradasDisponibles > 0) {
            entradasDisponibles--;
            System.out.println("Entrada vendida para: " + titulo);
            return true;
        } else {
            System.out.println("No hay entradas disponibles para: " + titulo);
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Entradas Disponibles: " + entradasDisponibles);
        System.out.println("----------------------------");
    }
}
