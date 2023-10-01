import java.util.ArrayList;
import java.util.Scanner;
public class Observacion {
    private Scanner scan;
    private EntradaDatos entrada = new EntradaDatos(scan);
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
                    entrada.telescopio(), null, entrada.tipoEspectral())
                );
                break;
        
            default:
                break;
        }
    }

    public void listaEstrellas(){}

    public void cantidadEstrellas(){}

    public void mostrarObservaciones(){}

    public void galaxiasTipo(){}
}
