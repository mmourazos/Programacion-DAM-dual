public class Argumentos {
    public static void main(String[] args) {
        /*
         * Los argumentos que se le pasan en la ejecución de la clase Argumentos se
         * almacenan en args:
         * 
         * java Argumentos uno dos tres
         * 
         * Dará como resultado que args = ["uno", "dos", "tres"]
         * 
         * args[0] será "uno"
         * args[1] será "dos"
         * y args[2] será "tres"
         */

        int i = 1;
        for (String argumento : args) {
            System.out.println("Argumento n. " + i + ": " + argumento);
            i = i + 1;
        }
    }
}
