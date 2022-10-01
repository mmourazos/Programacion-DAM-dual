public class Tarea5 {
    public static void main(String[] args) {
        // Crearé un bucle for que cuente de 1 a 100:
        for (int i = 1; i <= 100; i = i + 1) {
            System.out.println("bucle 'for': " + i);
        }

        // Con un bucle while sería:
        int i = 1;
        while (i <= 100) {
            System.out.println("bucle 'while': " + i);
            i += 1;
        }

        // Y con el do while sería más o menos igual.
        i = 0;

        do {
            System.out.println("bucle 'do while': " + i);
            ++i;
        } while (i <= 100);
    }

}
