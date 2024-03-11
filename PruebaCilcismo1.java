
import java.util.Scanner;

public class PruebaCilcismo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear equipo
        Equipo equipo = new Equipo("colombians", "Colombia");

        // Agregar ciclistas de diferentes tipos al equipo
        Velocista velocista = new Velocista(1, "carlos", 70, 100.0, 40.0);
        Escalador escalador = new Escalador(2, "maria", 40, 3.5f, 12.0f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "pedro", 80, 45.0);

        equipo.agregarCiclista(velocista);
        equipo.agregarCiclista(escalador);
        equipo.agregarCiclista(contrarrelojista);

        // Imprimir datos del equipo
        equipo.imprimirDatosEquipo();

        // Obtener e imprimir datos de un ciclista por identificador
        System.out.println("Ingrese el identificador del ciclista a buscar: ");
        int idCiclistaBuscado = scanner.nextInt();
        equipo.imprimirDatosCiclista(idCiclistaBuscado);
    }
}