import java.util.ArrayList;
class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static int sumaTiempos;  
  
    private ArrayList<Ciclista> ciclistas;

    protected Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.sumaTiempos = 0;
        this.ciclistas = new ArrayList<>();
    }

    protected  String getNombreEquipo() {
        return nombreEquipo;
    }

    protected void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    protected int getSumaTiempos() {
        return sumaTiempos;
    }
    
    protected void setSumaTiempos(int sumaTiempos) {
        this.sumaTiempos = sumaTiempos;
    }

    protected String getPaisEquipo() {
        return paisEquipo;
    }
    protected void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }


    protected ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    protected void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
        sumaTiempos += ciclista.getTiempoAcumulado();
    }

    protected  void calcularTiempoTotal(){
        int tiempoTotal = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotal += ciclista.getTiempoAcumulado();
        }
        this.sumaTiempos = tiempoTotal;
        System.out.println("El tiempo total del equipo fue: " + tiempoTotal + " minutos");
    }
    

    protected void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("País del equipo: " + paisEquipo);
        System.out.println("Suma de tiempos del equipo: " + sumaTiempos + " minutos");
        System.out.println("Lista de ciclistas del equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("El ciclista "+ciclista.getNombre()+" sumo "+ciclista.getTiempoAcumulado()+" minutos, y es "+ciclista.imprimirTipo());
        }
    }
    
    protected void imprimirDatosCiclista(int idCiclista) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == idCiclista) {
                System.out.println("Datos del ciclista:");
                System.out.println("Nombre: " + ciclista.getNombre());
                System.out.println("Identificador: " + ciclista.getIdentificador());
                System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + " minutos");
                System.out.println(ciclista.imprimirTipo());
                return;
            }
        }
        System.out.println("Ciclista no encontrado con el identificador suministrado: " + idCiclista);
    }
    
    protected void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas en el equipo:");
        for (Ciclista ciclista : ciclistas) {
            System.out.println(ciclista.getNombre() + " - " + ciclista.imprimirTipo());
        }
    }
}