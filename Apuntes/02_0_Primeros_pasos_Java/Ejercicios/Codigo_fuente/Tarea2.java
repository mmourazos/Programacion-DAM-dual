import java.io.Console;

public class Tarea2 {
    public static void main(String[] args) {

        // Puesto que vamos a leer un valor por consola necestiamos acceder a un OBJETO consola:
        Console c = System.console();

        // Le indicamos al usuario que introduzca un número:
        System.out.print("Introduce un número entero: ");
        // Para leer el texto del usuario (siempre String) usaremos una variable: entrada1.
        String entrada1 = c.readLine();

        // Haremos lo mismo que en los pasos anteriores para leer la segunda entrada:
        System.out.print("Introduce otro número entero: ");
        String entrada2 = c.readLine();

        // Para poder comparar los dos números antes hemos de convertirlos a entero (int):
        int num1 = Integer.parseInt(entrada1);
        int num2 = Integer.parseInt(entrada2);

        // Ahora los compararemos en un if:
        if (num1 < num2) { // Comprobamos si num1 es menor que num2.
            System.out.println("El número " + num1 + " es menor que " + num2 + ".");
        } else if (num1 > num2) { // Ahora comprobamos si num1 es mayor que num2.
            System.out.println("El número " + num1 + " es mayor que " + num2 + ".");
        } else { // Si no se cumple que num1 es mayor que num2 ni que num1 es menor que num2 es que
                 // son iguales.
            System.out.println("Los dos números son iguales.");
        }
    }
}
