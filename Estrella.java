public class Estrella extends ObjetoCeleste {
    private String tipoEspectral;

    public Estrella(String nombre, String fecha, float magnitudAparente, String tipo, String telescopio, float[] coordenadas, String tipoEspectral) {
        super(nombre, fecha, magnitudAparente, tipo, telescopio, coordenadas);
        this.tipoEspectral = tipoEspectral;
    }

    public String getTipoEspectral() {
        return tipoEspectral;
    }

    public void setTipoEspectral(String tipoEspectral) {
        this.tipoEspectral = tipoEspectral;
    }

    @Override
    public String toString(){
        return "Tipo de Objeto: "+tipo+
                "\nTipo Espectral: "+tipoEspectral+
                "\nMagnitud: "+magnitudAparente+
                "\nCoordenadas: "+coordenadas+
                "\nFecha: "+fecha+
                "\nTelescopio: "+telescopio+
                "\nAstrónomo: "+nombre;
    }
}