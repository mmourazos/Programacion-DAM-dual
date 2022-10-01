public class Tarea1 {
    /*
     * El argumento que recibe el método "main" es "args". Args es un Array de String, es decir, un
     * array de cadenas.
     * 
     * Cada una de las cadenas del array se corresponderá con los argumentos que se le pase al
     * programa en el momento de su invocación en la línea de comandos.
     * 
     * Así, si escribimos:
     * 
     * java Tarea1 uno 2 tres
     * 
     * Los argumentos serán "uno 2 tres" y * args[0] contendrá la cadena "uno". * args[1] contendrá
     * la cadena "2" (NO CONFUNDIR CON EL NÚMERO 2). * args[2] contendrá la cadena "tres".
     */
    public static void main(String[] args) {
        int x;
        int y;

        // Para hacer las operaciones aritméticas hemos de transformar los argumentos en valores
        // numéricos.
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        System.out.println("La suma de " + x + " e " + y + " es igual a: " + (x + y));
        System.out.println("La resta de " + x + " e " + y + " es igual a: " + (x - y));
        System.out.println("El producto de " + x + " e " + y + " es igual a: " + (x * y));
        System.out.println("La división de " + x + " e " + y + " es igual a: " + (x / y));
        System.out.println(
                "El resto (módulo) de dividir " + x + " entre " + y + " es igual a: " + (x % y));
    }

}
