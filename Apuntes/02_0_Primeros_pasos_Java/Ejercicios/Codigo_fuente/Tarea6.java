import java.io.Console;

public class Tarea6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int numero_buscado = Tarea4.random(min, max);

        Console c = System.console();
        boolean encontrado = false;
        int intentos = 1;

        do {

            System.out.print("Introduce un número entre " + min + " y " + max + ": ");
            int numero_introducido = Integer.parseInt(c.readLine());

            if (numero_buscado < numero_introducido) {
                System.out.println("El número buscado es menor que " + numero_introducido + ".");
            } else if (numero_buscado > numero_introducido) {
                System.out.println("El número buscado es mayor que " + numero_introducido + ".");
            } else {
                encontrado = true;
            }

            ++intentos;

        } while (!encontrado);

        if (intentos == 1) {
            System.out
                    .println("¡Has encontrado el número " + numero_buscado + " al primer intento!");
        } else {
            System.out.println(
                    "Has acertado el número " + numero_buscado + " en " + intentos + " intentos.");
        }
    }
}
