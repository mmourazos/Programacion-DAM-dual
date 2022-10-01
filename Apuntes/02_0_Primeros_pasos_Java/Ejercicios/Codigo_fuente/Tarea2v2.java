import java.util.Scanner;

/*
 * Esta es igual que la Tarea2 pero empleando otro método para aceptar los valores del usuario.
 */

public class Tarea2v2 {
    public static void main(String[] args) {
        // Creamos un escaner a partir de la entrada estandar del sistema (System.in).
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        // Le "pedimos" al escaner que nos de el primer número entero que escriba el usuario.
        int num1 = scanner.nextInt();

        System.out.print("Introduce otro número entero: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Los dos números son iguales.");
        } else if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que " + num2 + ".");
        } else {
            System.out.println("El número " + num1 + " es mayor que " + num2 + ".");
        }
    }
}
