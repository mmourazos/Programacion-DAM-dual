public enum TiposDeDatos {
    public static void main(String[] args) {
        // Para declarar una variable de tipo entero:
        int a;  // Declaramos una variable ('a') de tipo 'int' = entero de 32 bits.
        a = 10; // Asignamos el valor 10 a la variable 'a'.
        
        // O bien:
        int b = 10; // Declaramos una variable, 'b' de tipo entero y le asginamos un valor.

        // Si intentamos asignar a 'a' un valor nuevo no dará problemas:
        a = 100;

        // Salvo que no sea entero:
        a = 1.5;

        // Para valores enteros tenemos los tipos primitivos (no objetos):
        byte un_byte = 12; // 8 bits.
        short un_short = 1355; // 16 bits.
        int un_int = 66635600; // 32 bits.
        long un_long = 0; // un entero 'largo' de 64 bits.

        // Para números reales tendremos dos tipos:
        float f = 10.5;
        
        /* La línea anterior dará error porque, POR DEFECTO, los números reales se toman como double.
         * Así, el número 10.5, aunque no sea neceario, se almacena empleando 64 bits.
         * Si queremos evitar el error hemos de indicar que el número es float añadiendo la letra 'f'
         * a continuación del número:
        */
        float f1 = 10.5f;
        
        /* O bien hacer un CAST (converión sobre la marcha) del valor a float: */
        float f2 = (float) 10.5;
        
        /* El otro tipo de datos para almacenar números reales es 'double'.
         * El nombre 'double' hace referenca a 'doble percisión' y usa el doble de bits que float: 64.
         */
        double d = 10.5; // Aquí ya no da error porque 10.5 se interpreta como double.

        /* Lo normal es que cuando trabajemos con números reales usemos siempre 'double'. */
    }
}
