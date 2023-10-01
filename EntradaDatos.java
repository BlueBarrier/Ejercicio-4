
import java.util.Scanner;

public class EntradaDatos {
    private Scanner scan;
    public EntradaDatos(Scanner scan){this.scan = scan;}
    public int pedirTipo(){
        System.out.println("Ingrese el número de la observación que observo: "+
                                    "\n1. Estrellas"+
                                    "\n2. Planeta"+
                                    "\n3. Galaxia"+
                                    "\n4. Nebulosa"+
                                    "\n5. Cometa"+
                                    "\n6. Asteroide");
        String opcString = scan.nextLine().trim().toLowerCase();
        int opcion = 0;
        try {
            opcion = Integer.parseInt(opcString);
            return opcion;
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Ingrese una opción válida!");
            pedirTipo();
        }
        return opcion;
    }

    public String nombreAstronomo(){
        System.out.println("Ingrese el nombre del astrónomo: ");
        String name = scan.nextLine();
        name = name.trim().toLowerCase();        
        return name;
    }

    public String fechaObservacion(){
        System.out.println("Ingrese la fecha de la observación con el siguiente formato (dd/mm/aaaa): ");
        String fecha = scan.nextLine();
        fecha = fecha.trim().toLowerCase();
        return fecha;
    }

    public float magnitud(){
        System.out.println("Ingrese la magnitud aparente de la observación: ");
        try {
            float magnitud = scan.nextFloat();
            scan.nextLine();
            return magnitud;
        } catch (Exception e) {
            System.out.println("ingrese un valor válido");
            magnitud();
        }
        float magnitud = 0;
        return magnitud;
    }

    public String telescopio(){
        System.out.println("Ingrese el nombre del telescopio utilizado para la observación: ");
        String telescope = scan.nextLine();
        telescope = telescope.trim().toLowerCase();
        return telescope;
    }

    public String tipoEspectral(){
        System.out.println("Seleccione el tipo espectral de la estrella: "+
                                "\n1.O"+
                                "\n2.B"+
                                "\n3.A"+
                                "\n4.F"+
                                "\n5.G"+
                                "\n6.K"+
                                "\n7.M");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    return "O";
                    
                case 2:
                    return "B";
                    
                case 3:
                    return "A";
                    
                case 4:
                    return "F";
                    
                case 5: 
                    return "G";
                    
                case 6:
                    return "K";
                    
                case 7: 
                    return "M";
            
                default:
                    System.out.println("Ingrese una opcion valida");
                    pedirTipo();
            }
        } catch (Exception e) {
            System.out.println("Ingrese un valor válido!");
            tipoEspectral();
        }
        return "";
    }

    public float[] coordenadas(){
        System.out.println("Ingrese la ascensión recta: ");
        try {
            float recta = scan.nextFloat();
            scan.nextLine();
            try {
                System.out.println("Ingrese la declinación: ");
                float declina = scan.nextFloat();
                scan.nextLine();
                float[] coords = new float[2];
                coords[0] = recta;
                coords[1] = declina; 
                return coords;
            } catch (Exception e) {
                System.out.println("Ingrese una declinación valida");
                coordenadas();
            }
        } catch (Exception e) {
            System.out.println("Ingrese una ascención valida");
            coordenadas();
        }
        return null;
    }
    public int menu(){
        System.out.println("\nMenú"+
                        "\n1.");
    }
}
