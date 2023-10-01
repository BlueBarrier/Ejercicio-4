import java.util.ArrayList;
public class Observacion {
    private EntradaDatos entrada = new EntradaDatos();
    private ArrayList<ObjetoCeleste> objetosObservados;
    private ArrayList<Estrella> estrellasObservadas;
    private ArrayList<Galaxia> galaxiasObservadas;

    /**
     * @param objetosObseravdos
     * @param estrellasObservadas
     * @param galaxiasObservadas
     */
    public Observacion(ArrayList<ObjetoCeleste> objetosObseravdos, ArrayList<Estrella> estrellasObservadas, ArrayList<Galaxia> galaxiasObservadas){
        this.objetosObservados = objetosObseravdos;
        this.estrellasObservadas = estrellasObservadas;
        this.galaxiasObservadas = galaxiasObservadas;
    }




    /**
     * clase que registra una observación en base a la opción realizada por el usuario
     */
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
                    entrada.telescopio(),entrada.coordenadas(), entrada.tipoGalaxia(), entrada.lightYears())
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

    /**
     * método que muestra una lista de estrellas por tipo
     */
    public void listaEstrellas(){
        ArrayList<Estrella> tipoO = new ArrayList<>();
        ArrayList<Estrella> tipoB = new ArrayList<>();
        ArrayList<Estrella> tipoA = new ArrayList<>();
        ArrayList<Estrella> tipoF = new ArrayList<>();
        ArrayList<Estrella> tipoG = new ArrayList<>();
        ArrayList<Estrella> tipoK = new ArrayList<>();
        ArrayList<Estrella> tipoM = new ArrayList<>();
        ArrayList<ArrayList<Estrella>> listaEstrellas = new ArrayList<>();
        for (Estrella estrella : estrellasObservadas) {
            if (estrella.getTipoEspectral() == "O") {
                tipoO.add(estrella);
            } else if(estrella.getTipoEspectral() == "B") {
                tipoB.add(estrella);
            } else if(estrella.getTipoEspectral() == "A"){
                tipoA.add(estrella);
            }else if(estrella.getTipoEspectral() == "F"){
                tipoF.add(estrella);
            }else if(estrella.getTipoEspectral() == "G"){
                tipoG.add(estrella);
            }else if(estrella.getTipoEspectral() == "K"){
                tipoK.add(estrella);
            }else if(estrella.getTipoEspectral() == "M"){
                tipoM.add(estrella);
            }
        }
        try {
            listaEstrellas.add(tipoO);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoB);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoA);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoF);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoG);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoK);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            listaEstrellas.add(tipoM);
        } catch (Exception e) {
            // TODO: handle exception
        }
        for (ArrayList<Estrella> tipos : listaEstrellas) {
            int count = 0;
            for (Estrella star : tipos) {
                if (star.getTipoEspectral() == "O") {
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo O: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "B"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo B: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "A"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo A: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "F"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo F: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "G"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo G: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "K"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo K: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }else if(star.getTipoEspectral() == "M"){
                    if (count == 0) {
                        System.out.println("\n Estrellas tipo M: ");
                        System.out.println(star);
                        count++;
                    }else{
                        System.out.println(star);
                    }
                }
            }
        }
    }

    /**
     * método para mostar todas las observaciones
     */
    public void mostrarObservaciones(){
        for (ObjetoCeleste observacion : objetosObservados) {
            System.out.println("\nObservaciones:");
            System.out.println(observacion);
        }
        for (Estrella estrella : estrellasObservadas) {
            System.out.println(estrella);
        }
        for (Galaxia galaxia : galaxiasObservadas) {
            System.out.println(galaxia);
        }
    }

    /**
     * método que muestra el conteo de tipos de galaxias
     */
    public void galaxiasTipo(){
        int conteoEspiral = 0;
        int conteoEliptica = 0;
        int conteoIrregular = 0;

        for (Galaxia galaxy : galaxiasObservadas) {
            if (galaxy.getTipoGalaxia() == "Espiral") {
                conteoEspiral++;
            }else if (galaxy.getTipoGalaxia() == "Elíptica") {
                conteoEliptica++;
            }else if (galaxy.getTipoGalaxia() == "Irregular") {
                conteoIrregular++;
            }
        }
        System.out.println("\nEspirales: "+conteoEspiral);
        System.out.println("Elíptica: "+conteoEliptica);
        System.out.println("Irregular: "+conteoIrregular);
    }
}
