package Taller_Colecciones;

public class Revista extends Material{

    private final int edicion;
    private final String tematica;

    public Revista(String codigo, String titulo, int anio, boolean disponible, int edicion, String tematica) {
        super(codigo, titulo, anio, disponible);
        this.edicion = edicion;
        this.tematica = tematica;
    }

    public int getEdicion() {
        return edicion;
    }

    public String getTematica() {
        return tematica;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

}
