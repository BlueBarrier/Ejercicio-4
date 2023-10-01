public class Galaxia extends ObjetoCeleste {
    private String tipoGalaxia;
    private int distancia;

    public Galaxia(String nombre, String fecha, float magnitudAparente, String tipoObjetoCeleste, String telescopio, float[] coordenadas, String tipoGalaxia, int distancia) {
        super(nombre, fecha, magnitudAparente, tipoObjetoCeleste, telescopio, coordenadas);
        this.tipoGalaxia = tipoGalaxia;
        this.distancia = distancia;
    }

    public String getTipoGalaxia() {
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
    @Override
    public String toString(){
        return "Tipo de Objeto: "+tipo+
                "\nTipo de Galaxia: "+tipoGalaxia+
                "\nDistancia: "+distancia+
                "\nMagnitud: "+magnitudAparente+
                "\nCoordenadas: "+coordenadas+
                "\nFecha: "+fecha+
                "\nTelescopio: "+telescopio+
                "\nAstrónomo: "+nombre;
    }
}