# Ejercicios 1

## Variables, operadores y estructuras condicionales

### 1. Tarea 1ª

1. Declara dos variables numéricas y almacena en ellas los dos primeros argumentos que se le pase al programa.
2. Indica los resultados de las siguientes operaciones:
   * Suma
   * Resta
   * Multiplicación
   * División
   * Módulo

### 2. Tarea 2ª

1. Declara dos variables numéricas y asígnales valores que se le pidan al usuario por consola.
2. Compara los dos valores e indica cual es mayor y cual menor o si son iguales.

### 3. Tarea 3ª

Introduce un número por teclado e indica si es par o impar.

### 4. Tarea 4ª

1. Crea un programa que acepte dos argumentos: min y max.
2. Utilizando la función `Math.random()` o el objeto `Random` genera un número aleatorio comprendido entre los dos valores que hemos indicado en el paso anterior.

Ejemplo:

```bash
java Aleatorio 1 10
5
java Aleatorio 1 10
3
java Aleatorio 1 10
10
java Aleatorio 1 10
6
```

## Bucles

### 5. Tarea 5ª

Escribe un programa que muestre por pantalla los números de 1 al 100.

### 6. Tarea 6ª

Escribe un programa que admita dos argumentos min y max y:
1. Genere un valor aleatorio entero entre min y max.
2. Le pida un valor entero al usuario por teclado.
3. Compruebe si el valor introducido es menor, mayor o igual al generado en el paso 1.
   1. Si el valor es menor o mayor ha de comunicárselo al usuario y volver al paso 2 (para pedirle un nuevo número).
   2. Si el valor es igual el programa deberá finalizar e indicar al usuario cuantos intentos ha necesitado para averiguar el número.

## Instrucciones de compilación y ejecución
### Compilación
Para compilar las tareas asegurarse de que no estan en un paquete. Visual Studio Code (con las extensiones de Java) a veces detecta el directorio donde guardamos nuestro código como un paquete y crea una linea al principio del archivo de código fuente como: `package Ejercicios.Codigo_fuente;`. Si hace esto, borrad esa línea.

Si nos encontramos en el directorio donde está el archivo ".java" lo que hemos de escribir es:
```bash
javac -encoding utf8 TareaX.java
```
(Si hemos nombrado las tareas como 1, 2, 3 substituimos la X por el número de la tarea).

La opción `-encoding utf8` le indica al compilador que nuestro código fuente está en un archivo de texto con codificación [UNICODE](https://en.wikipedia.org/wiki/Unicode). De este modo nos libramos de los *caracteres raros* que se imprimían en la consola cuand teníamos tildes o la ñ.

### Ejecución
Para ejecutar el programa, una vez compilado (comprobaremos que existe el archivo ".class") hemos de ejecutar el comando:
```bash
java TareaX
```

Nótese se no se indica la ruta ni la extensión del fichero.