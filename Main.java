import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EntradaDatos entrada = new EntradaDatos(); 
        Observacion observacion = new Observacion(scan, new ArrayList<ObjetoCeleste>(), 
        new ArrayList<Estrella>(), new ArrayList<Galaxia>());
        boolean out = false;
        do {
            switch (entrada.menu()) {
                case 1:
                    observacion.registrarObservacion();
                    break;
                case 2:
                    observacion.mostrarObservaciones();
                    break;
                case 3:
                    observacion.listaEstrellas();
                    break;
                case 4:
                    observacion.galaxiasTipo();
                    break;
                case 5:                    
                    System.out.println("Gracias por usar el programa!");
                    out = true;
                default:
                    break;
            }
        } while (!out);
        scan.close();
    }
}
