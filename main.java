package Taller_Colecciones;

public class main {
    public static void main(String[] args) {

        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        Libro libro1 = new Libro("BK-2024-001", "Cien años de soledad", 1967, true, "Gabriel García Márquez", "788GHT98LIF");
        Libro libro2 = new Libro("BK-2026-002", "La sombra del viento", 1955,false, "Carlos Ruiz Zafón", "788GHT98904");
        Revista revista1 = new Revista("RV-2026-001", "Ciencia y Investigacion", 2026, true, 12, "Ciencias");
        Revista revista2 = new Revista("RV-2026-002", "Tecnología hoy", 2026, true, 8, "Tecnología");

        biblioteca.registrarMaterial(libro1);
        biblioteca.registrarMaterial(libro2);
        biblioteca.registrarMaterial(revista1);
        biblioteca.registrarMaterial(revista2);

        System.out.println("###Busqueda en inventario###");
        Material encontrado = biblioteca.buscarMaterial("BK-2024-001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        Material inexistente = biblioteca.buscarMaterial("Sin existencias");
        System.out.println("Código inexistente: " + (inexistente == null ? "no encontrado" : "encontrado"));

        System.out.println("###Lista de espera###");
        libro1.setDisponible(false);
        biblioteca.agregarEspera(libro1.getCodigo(), "Ana");
        biblioteca.agregarEspera(libro1.getCodigo(), "Nath");
        biblioteca.agregarEspera(libro1.getCodigo(), "Sergio");
        System.out.println("Primero: " + biblioteca.siguienteEnEspera(libro1.getCodigo()));
        System.out.println("Segundo: " + biblioteca.siguienteEnEspera(libro1.getCodigo()));

        System.out.println("###Membresias###");
        System.out.println("Ana, primer registro: " + biblioteca.registrarMiembro("Ana"));
        biblioteca.registrarMiembro("Nath");
        biblioteca.registrarMiembro("Sergio");
        System.out.println("Ana, registro repetido: " + biblioteca.registrarMiembro("Ana"));
        System.out.println("Nath tiene membresía: " + biblioteca.tieneMembresia("Nath"));
        System.out.println("Pedro tiene membresía: " + biblioteca.tieneMembresia("Pedro"));

        System.out.println("###Invetario###");
        biblioteca.mostrarCatalogo();
    }
}
