package costosjni.lib;

/**
 * Clase que representa las funciones de la biblioteca dinámica JNI para costos
 */
public class JavaCostos {
    // Métodos nativos
    public native String calcularCostosJSON(double costoFijo, double costoVariable, int cantidadProducida, double margenGanancia);

    public JavaCostos() {
        try {
            System.loadLibrary("costos"); // Asegúrate que la librería se llame libcostos.so / costos.dll / libcostos.dylib
            System.out.println("Biblioteca JNI 'costos' cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Error al cargar la biblioteca JNI: " + e.getMessage());
        }
    }
}

