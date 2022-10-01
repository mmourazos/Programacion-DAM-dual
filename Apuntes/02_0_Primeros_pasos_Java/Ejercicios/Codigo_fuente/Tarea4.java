public class Tarea4 {
    public static int random(int min, int max) {
        return (int) Math.random() * (max - min + 1) + min;
    }

    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int aleatorio = random(min, max);

        System.out.println(aleatorio);
    }
}
