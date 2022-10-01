import java.util.Random;

public class Tarea4v2 {
    public static int random(int min, int max) {
        Random r = new Random();

        return r.nextInt(max - min) + min;

    }

    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int aleatorio = random(min, max);
        System.out.println(aleatorio);
    }
}
