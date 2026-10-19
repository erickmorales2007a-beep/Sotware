public class Modulo {
    public String nombre;
    public String lenguaje;

    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("El módulo " + nombre + " ha sido marcado como terminado.");
    }

    void mostrarEstado() {
        if (terminado) {
            System.out.println("El módulo " + nombre + " ya está completado.");
        } else {
            System.out.println("El módulo " + nombre + " aún está en desarrollo.");
        }
    }

    void mostrarVersion() {
        System.out.println("Versión actual de " + nombre + ": " + version);
    }
}