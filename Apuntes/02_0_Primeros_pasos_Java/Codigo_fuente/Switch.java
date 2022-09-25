import java.io.Console;

public class Switch {
    public static void main(String[] args) {
        Console c = System.console();

        int value = Integer.parseInt(c.readLine());

        switch (value) {
            case 1:
                System.out.println("El número introducido fue uno.");
                break;
            case 2:
                System.out.println("El número introducido fue dos.");
                break;
            case 3:
                System.out.println("El número introducido fue tres.");
                break;
            default:
                System.out.println("No se ha introducido un número entre 1 y 3.");
        }
    }
}
