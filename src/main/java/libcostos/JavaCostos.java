package libcostos;

public class JavaCostos {
    // Métodos nativos
    public native String generarJSONCostos(float cfijo, float cvariable, float cindirecto, int unidades, float margenGanancia);

    public JavaCostos() {
        try {
            System.loadLibrary("costos");
            System.out.println("Biblioteca 'costos' cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Error al cargar la biblioteca : " + e.getMessage());
        }
    }
}

