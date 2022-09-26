public class EntradaArgumentos {

    public static void main(String[] args) {
        /*
         * Los argumentos que se le pasan en la ejecución de la clase Argumentos se almacenan en la
         * variable args. (args es un Array de Strings.)
         * 
         * Así, si ejecutamos nuestro programa com la sentencia de consola: java Argumentos uno dos
         * tres
         * 
         * Dará como resultado que args vardrá ["uno", "dos", "tres"]
         * 
         * Para acceder a cada uno de los valores hemos de usar la sintaxis:
         * 
         * args[0] para acceder al primer valor (será "uno"). args[1] para acceder al segudno valor
         * (será "dos"). y args[2] para acceder al tercer valor (será "tres").
         * 
         * Nótese que los valores son String (cadena de caracteres).
         */

        String arg1 = args[0];
        String arg2 = args[1];
        String arg3 = args[2];

        /*
         * Si hemos pasado valores numéricos enteros y queremos usarlos en nuestro programa hemos de
         * convertir convertir sus valores de tipo String a valores del tipo primitivo int:
         */

        int value1 = Integer.parseInt(arg1);
        int value2 = Integer.parseInt(arg2);
        int value3 = Integer.parseInt(arg3);

        String outputString = "La suma de los argumentos (%s, %s y %s) es %d.";

        System.out.println(String.format(outputString, arg1, arg2, arg3, value1 + value2 + value3));

    }
}
