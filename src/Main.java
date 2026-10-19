public class Main {
    public static void main(String[] args) {
        Modulo login = new Modulo();
        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0.0";
        login.terminado = true;

        Modulo inventario = new Modulo();
        inventario.nombre = "Inventario";
        inventario.lenguaje = "Python";
        inventario.version = "1.2.5";
        inventario.terminado = false;

        Modulo reportes = new Modulo();
        reportes.nombre = "Reportes";
        reportes.lenguaje = "JavaScript";
        reportes.version = "0.9.1";
        reportes.terminado = false;

        System.out.println("=== PRUEBA DE MÓDULOS DE SOFTWARE ===");

        login.mostrarInformacion();
        System.out.println();

        inventario.mostrarInformacion();
        System.out.println();
        reportes.mostrarInformacion();
        System.out.println("-------------------------------------");
        System.out.println("Actualizando el módulo de inventario...");
        inventario.marcarTerminado();

        System.out.println();
        inventario.mostrarEstado();
        reportes.mostrarEstado();
    }
}