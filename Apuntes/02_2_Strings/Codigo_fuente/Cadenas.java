public class Cadenas {
    public static void main(String[] args) {
        String cadena = "Hola mundo";
        int longitud = cadena.length();

        System.out.println("La cadena \"" + cadena + "\" tiene " + longitud + "caracteres.");

        String str1 = "Hola mundo";
        String str2 = str1;

        if (str1 == str2) {
            System.out.println("str1 y str2 son el mismo objeto ñññ.");
        } else {
            System.out.println("str1 y str2 son dos objetos distintos ñññ.");
        }
        str1 = str1.toUpperCase();

        System.out.printf("str1: %s.%n", str1);
        System.out.printf("str2: %s.%n", str2);
    }
}
