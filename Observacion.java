import java.util.ArrayList;
import java.util.Scanner;
public class Observacion {
    private Scanner scan;
    private EntradaDatos entrada = new EntradaDatos();
    private ArrayList<ObjetoCeleste> objetosObservados;
    private ArrayList<Estrella> estrellasObservadas;
    private ArrayList<Galaxia> galaxiasObservadas;

    public Observacion(Scanner scan, ArrayList<ObjetoCeleste> objetosObseravdos, ArrayList<Estrella> estrellasObservadas, ArrayList<Galaxia> galaxiasObservadas){
        this.scan = scan;
        this.objetosObservados = objetosObseravdos;
        this.estrellasObservadas = estrellasObservadas;
        this.galaxiasObservadas = galaxiasObservadas;
    }




    public void registrarObservacion(){
        switch (entrada.pedirTipo()) {
            case 1:
                estrellasObservadas.add(
                    new Estrella(entrada.nombreAstronomo(), entrada.fechaObservacion(), entrada.magnitud(), "Estrella",
                    entrada.telescopio(), entrada.coordenadas(), entrada.tipoEspectral())
                );
                break;
            case 2: 
                objetosObservados.add(
                    new ObjetoCeleste(entrada.nombreAstronomo(), entrada.fechaObservacion(),entrada.magnitud(), "Planeta",
                    entrada.telescopio(),entrada.coordenadas())
                );
                break;
            case 3:
                galaxiasObservadas.add(
                    new Galaxia(entrada.nombreAstronomo(), entrada.fechaObservacion(),entrada.magnitud(), "Galaxia",
                    entrada.telescopio(),entrada.coordenadas(), null, 0)
                );
                break;
            case 4:
                objetosObservados.add(
                    new ObjetoCeleste(entrada.nombreAstronomo(), entrada.fechaObservacion(),entrada.magnitud(), "Nebulosa", 
                    entrada.telescopio(),entrada.coordenadas())
                );
                break;
            case 5:
                objetosObservados.add(
                    new ObjetoCeleste(entrada.nombreAstronomo(), entrada.fechaObservacion(),entrada.magnitud(), "Cometa", 
                    entrada.telescopio(),entrada.coordenadas())
                );
                break;
            case 6:
                objetosObservados.add(
                    new ObjetoCeleste(entrada.nombreAstronomo(), entrada.fechaObservacion(),entrada.magnitud(), "Asteroide", 
                    entrada.telescopio(),entrada.coordenadas())
                );
                break;                
            default:
                System.out.println("Opción invalida");
                break;
        }
    }

    public void listaEstrellas(){}

    public void mostrarObservaciones(){}

    public void galaxiasTipo(){}
}
