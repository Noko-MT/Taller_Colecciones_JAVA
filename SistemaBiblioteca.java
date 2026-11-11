package Taller_Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class SistemaBiblioteca {

    private final Map<String, Material> catalogo = new HashMap<>();
    private final Map<String, List<String>> listaEspera = new HashMap<>();
    private final Set<String> miembros = new HashSet<>();

    public void registrarMaterial(Material material) {
        catalogo.put(material.getCodigo(), material);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        for (Map.Entry<String, Material> entrada : catalogo.entrySet()) {
            System.out.println(entrada);
            entrada.getValue().mostrarInfo();
        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {
        List<String> usuarios = listaEspera.get(codigoMaterial);
        if (usuarios == null) {
            usuarios = new ArrayList<>();
            listaEspera.put(codigoMaterial, usuarios);
        }
        usuarios.add(usuario);
    }

    public String siguienteEnEspera(String codigoMaterial) {
        List<String> usuarios = listaEspera.get(codigoMaterial);
        if (usuarios == null || usuarios.isEmpty()) {
            return null;
        }
        return usuarios.remove(0);
    }

    public boolean registrarMiembro(String usuario) {
        return miembros.add(usuario);
    }

    public boolean tieneMembresia(String usuario) {
        return miembros.contains(usuario);
    }
}
