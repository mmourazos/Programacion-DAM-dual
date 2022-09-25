import java.io.Console;

/**
 * BucleWhile
 */

public class BucleWhile {

    public static void main(String[] args) {
        Console c = System.console();
        int num_iter = Integer.parseInt(c.readLine());

        int contador = 0;
        while (contador < num_iter) {
            System.out.println("Esta es la iteración numero " + contador + ".");
            contador = contador + 1;
        }
    }
}