
import java.util.Scanner;

public class EntradaDatos {
    private Scanner scan = new Scanner(System.in);
    /**
     * @return
     */
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

    /**
     * @return
     */
    public String nombreAstronomo(){
        System.out.println("Ingrese el nombre del astrónomo: ");
        String name = scan.nextLine();
        name = name.trim().toLowerCase();        
        return name;
    }

    /**
     * @return
     */
    public String fechaObservacion(){
        System.out.println("Ingrese la fecha de la observación con el siguiente formato (dd/mm/aaaa): ");
        String fecha = scan.nextLine();
        fecha = fecha.trim().toLowerCase();
        return fecha;
    }

    /**
     * @return
     */
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

    /**
     * @return
     */
    public String telescopio(){
        System.out.println("Ingrese el nombre del telescopio utilizado para la observación: ");
        String telescope = scan.nextLine();
        telescope = telescope.trim().toLowerCase();
        return telescope;
    }

    /**
     * @return
     */
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

    /**
     * @return
     */
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

    /**
     * @return
     */
    public String tipoGalaxia(){
        System.out.println("Seleccione el tipo de galaxia"+
                                "\n1. Espiral"+
                                "\n2. Elíptica"+
                                "\n3. Irregular");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1:
                    return "Espiral";
                case 2:
                    return "Elíptica";
                case 3:
                    return "Irregular";
                default:
                System.out.println("Ingrese una opción valida");
                tipoGalaxia();                    
            }
        } catch (Exception e) {
            System.out.println("Ingrese una opción valida");
            tipoGalaxia();
        }
        return "";
    }

    /**
     * @return
     */
    public int lightYears(){
        System.out.println("Ingrese la distancia de la galaxia en años luz: ");
        try {
            int luz = scan.nextInt();
            return luz;
        } catch (Exception e) {
            System.out.println("Ingrese un valor valido");
            lightYears();
        }
        return 0;
    }

    /**
     * @return
     */
    public int menu(){
        System.out.println("\nMenú"+
                        "\n1. Registrar una nueva observación"+
                        "\n2. Mostrar todas las observaciones registradas"+
                        "\n3. Listar estrellas observadas según su tipo espectral"+
                        "\n4. Galaxias por tipo"+
                        "\n5. Salir");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        } catch (Exception e) {
            System.out.println("Ingrese una opción valida");
            menu();
        }
        return 0;
    }
}
