import java.io.Console;

public class EntradaTeclado {
    public static void main(String[] args) {

        Console c = System.console(); // Obtenemos una referencia al objeto consola del sistema.

        // A diferencia de println() print() no salta a la siguiente línea.
        System.out.print("Dime tu nombre: ");

        // c.readLine() se queda leyendo hasta que pultas ENTER.
        String nombre = c.readLine();

        System.out.println("¡Hola " + nombre + "!");
    }
}
