package Taller_Colecciones;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaBiblioteca {

    private final Map<String, Material> catalogo = new HashMap<>();

    public void registrarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        for (map.Entry<String, Material> entrada : catalogo.entrySet()) {
            System.out.println(entrada);
        }
    }
}
