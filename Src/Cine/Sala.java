package Cine;

public class Sala {
    String idSala;
    String tipoSala;
    int capacidadTotalDeSala;
    int asientosOcupados;

    public Sala(String idSala, String tipoSala, int capacidadTotalDeSala, int asientosOcupados) {
        this.idSala = idSala;
        this.tipoSala = tipoSala;
        this.capacidadTotalDeSala= capacidadTotalDeSala;
        this.asientosOcupados = asientosOcupados;
    }

    public boolean ocuparAsiento() {
        if (asientosOcupados < capacidadTotalDeSala) {
            asientosOcupados++;
            System.out.println("Asiento ocupado en " + idSala);
            return true;
        } else {
            System.out.println("La sala está llena. No se pueden ocupar más asientos.");
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("ID Sala: " + idSala);
        System.out.println("Tipo de sala: " + tipoSala);
        System.out.println("Capacidad total: " + capacidadTotalDeSala);
        System.out.println("Asientos ocupados: " + asientosOcupados);
        System.out.println("-----------------------------");
    }
}
