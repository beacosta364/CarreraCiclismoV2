import java.util.Scanner;

public class PruebaCiclismo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();
        System.out.println("Ingrese el pais al que pertenece el equipo:");
        String paisEquipo = scanner.nextLine();
        Equipo equipo = new Equipo(nombreEquipo, paisEquipo);

        int opcion;
        do{       
            System.out.println("\nQue opcin desea seleccionar:");
            System.out.println("1. Agregar ciclista");
            System.out.println("2. Imprimir datos del equipo");
            System.out.println("3. Buscar e imprimir datos de ciclista por identificador");
            System.out.println("4. Listar ciclistas del equipo");
            System.out.println("5. Mostrar Tiempo Total del Equipo");///////////////////
            System.out.println("6. Salir");
            System.out.println("Ingrese su elección:");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarCiclista(equipo);
                    break;
                case 2:
                    equipo.imprimirDatosEquipo();
                    break;
                case 3:
                    buscarEImprimirCiclista(equipo, scanner);
                    break;
                case 4:
                    equipo.listarNombresCiclistas();
                    break;
                case 5:
                    equipo.calcularTiempoTotal();
                    //System.out.println("falta agregar el metodo a equipo");
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                System.out.println("Opcion no valida. seleccione una opcion correcta.");
            }
        
        } while (opcion != 0);

        scanner.close();

    }

    private static void agregarCiclista(Equipo equipo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de ciclista:");
        System.out.println("1. Velocista");
        System.out.println("2. Escalador");
        System.out.println("3. Contrarrelojista");
        int tipoCiclista = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el identificador del ciclista:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el nombre del ciclista:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tiempo acumulado del ciclista en minutos:");
        int tiempoAcumulado = scanner.nextInt();

        switch (tipoCiclista) {
            case 1:
                System.out.println("Ingrese la potencia promedio del Velocista:");
                double potenciaPromedio = scanner.nextDouble();
                System.out.println("Ingrese la velocidad promedio del Velocista:");
                double velocidadPromedioSprint = scanner.nextDouble();
                Velocista velocista =new Velocista(id, nombre, tiempoAcumulado, potenciaPromedio, velocidadPromedioSprint);
                equipo.agregarCiclista(velocista);
                break;
            case 2:
                System.out.println("Ingrese la aceleración promedio en subida del Escalador:");
                float aceleracionPromedioSubida = scanner.nextFloat();
                System.out.println("Ingrese el grado de rampa soportada del Escalador:");
                float gradoRampaSoportada = scanner.nextFloat();
                Escalador escalador = new Escalador(id, nombre, tiempoAcumulado, aceleracionPromedioSubida, gradoRampaSoportada);
                equipo.agregarCiclista(escalador);
                break;
            case 3:
                System.out.println("Ingrese la velocidad máxima del Contrarrelojista:");
                double velocidadMaxima = scanner.nextDouble();

                Contrarrelojista contrarrelojista = new Contrarrelojista(id, nombre, tiempoAcumulado, velocidadMaxima);
                equipo.agregarCiclista(contrarrelojista);
                break;
            default:
                System.out.println("Tipo de ciclista no válido.");
        }
    }
    private static void buscarEImprimirCiclista(Equipo equipo, Scanner scanner) {
        System.out.println("Ingrese el identificador del ciclista a buscar:");
        int idCiclistaBuscado = scanner.nextInt();
        equipo.imprimirDatosCiclista(idCiclistaBuscado);
    }
}
