import java.io.Console;

public class Tarea3 {
    public static void main(String[] args) {
        /* Al igual que en la tarea2 necesitamos leer de consola. */
        Console c = System.console();

        System.out.print("Introduce un valor entero: ");
        int num = Integer.parseInt(c.readLine());

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " es impar.");
        }
    }

}
