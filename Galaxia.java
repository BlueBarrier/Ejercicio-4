public class Galaxia extends ObjetoCeleste {
    private String tipo;
    private int distancia;

    public Galaxia(String nombre, String fecha, float magnitudAparente, String tipoObjetoCeleste, String telescopio, float[] coordenadas, String tipoGalaxia, int distancia) {
        super(nombre, fecha, magnitudAparente, tipoObjetoCeleste, telescopio, coordenadas);
        this.tipo = tipoGalaxia;
        this.distancia = distancia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}