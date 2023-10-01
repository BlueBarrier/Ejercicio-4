/**
 * Universidad del Valle de Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos
 * 
 * @author Erick Barrera
 * @version 1.0
 * @created 30/09/23
 * @last_updated 30/09/23 
 * 
 * 
 * Clase que almacena los datos de las observaciones realizadas en un observatorio
 */
public class ObjetoCeleste{
    // creación de los atributos de clase
    protected String nombre, fecha, tipo, telescopio; 
    protected float magnitudAparente;
    protected float[] coordenadas;

    /**
     * Constructor de la clase que inicializa sus atributos
     * 
     * @param nombre                    El nombre del astrónomo
     * @param fecha                     Fecha de la observación
     * @param magnitudAparente          Número decimal que registra la magnitud del cuerpo celeste
     * @param tipo                      Tipo de objeto observado
     * @param coordenadas               Coordenadas de ascensión recta y declinación
     * @param telescopio                Telescopio con el que fue observado
     */
    public ObjetoCeleste(String nombre, String fecha, float magnitudAparente, String tipo, String telescopio, float[] coordenadas){
        this.nombre = nombre;
        this.fecha = fecha;
        this.magnitudAparente = magnitudAparente;
        this.tipo = tipo;
        this.coordenadas = coordenadas;
        this.telescopio = telescopio;
    }

    /**
     * getter para atríbuto nombre
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setter para atríbuto nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return coordenadas      Atríbuto lista de coordenadas
     */
    public float[] getCoordenadas() {
        return coordenadas;
    }
    /**
     * setter para atríbuto coordenadas
     * 
     * @param coordenadas
     */
    public void setCoordenadas(float[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * getter para atríbuto fecha
     * 
     * @return
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * setter para atríbuto fecha
     * 
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * getter para atríbuto magnitudAparente
     * 
     * @return magnitudAparente
     */
    public float getMagnitudAparente() {
        return magnitudAparente;
    }

    /**
     * setter para atríbuto magnitudAparente
     * 
     * @param magnitudAparente
     */
    public void setMagnitudAparente(float magnitudAparente) {
        this.magnitudAparente = magnitudAparente;
    }


    /**
     * getter para atríbuto telescopio
     * 
     * @return telescopio
     */
    public String getTelescopio() {
        return telescopio;
    }
    /**
     * setter para atríbuto telescopio
     * 
     * @param telescopio
     */
    public void setTelescopio(String telescopio) {
        this.telescopio = telescopio;
    }

    /**
     * getter para atríbuto tipo
     * 
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * setter par atríbuto tipo
     * 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}