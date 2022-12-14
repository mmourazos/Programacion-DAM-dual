# Cadenas de caracteres

Las cadenas de caracteres se utilizan en los lenguajes de programación para, básicamente, almacenar texto.

La representación interna de las mismas varía de lenguaje a lenguaje y, en el caso de Java, se implementan utilizando la case `String`.

La clase `String` representa secuencias de caracteres. Todos los literales cadena como "abc" se implementan mediante instancias de la clase `String`.

## La clase `String`

### Inmutables

Los cadenas de tipo `String` son inmutables. Sus valores no pueden ser modificados después de su creación.

(Impacto en la memoria.)

## Caracteres especiales

### Carácter de escape

El carácter **\\** se denomina ***backslash*** y sirve para *escapar* caracteres que de otra forma no podrían escribirse en una cadena.

Por ejemplo, si queremos escribir **"** dentro de una cadena Java interpretaría estas comillas como el indicador de fin de cadena. Para evitar eso usaremos el carácter de escape:

```java
String ejemplo = "Ella me dijo \"no te preocupes\"";
```

Lo mismo sucede con **\\** y **'**. Que han de ir precedidos del carácter de escape para que se muestren correctamente.

Otros símbolos que se escriben utilizando el carácter de escape son los siguientes:

* **\n** 	Nueve línea.
* **\r** 	Retorno de carro.
* **\t** 	Tabulación.
* **\b** 	Borrar.

## Funciones de `String`

### Longitud de una cadena

El método `length` nos devuelve un valor entero que indica cuantos caracteres contiene la cadena:

```java
String cadena = "Hola mundo";
int longitud = cadena.length();
```

### Pasar a mayúsculas / minúsculas

Los métodos `toUpperCase` y `toLowerCase` nos devolverán una cadena similar a la nuestra pero con todos los caracteres en mayúsculas o minúsculas.

```java
String error = "error";
System.out.println("Has cometido un " + error.toUpperCase());
/*
   Mostrará: "Has cometido un ERROR".
*/
```

## Cadenas con formato

Hasta este momento estuvimos usando la concatenación para mostrar cadenas con valores numéricos y de otro tipo que habíamos calculado en nuestros programas:

```java
System.out.prinln("Hola " + nombre + ".");
```

Otra forma de realizar esto es mediante el uso de cadenas con formato:
```java
System.out.printf("Hola %s.\n");
```

Para ello hemos de usar el método `format` de la clase `String`:

* `%a` : Acepta **float y genera la representación hexadecimal del número.

  ```java
  System.out.printtf("%a", 1.25f);
  //Muestra: 0x1.0p4
  ```

* `%b`: Acepta cualquier tipo y devuelve "true" si el argumento es **true** o no nulo y "false" en caso contrario.

* `%c`: Acepta caracteres unicode y los representa.

* **`%d`**: Acepta cualquier valor entero (byte, short, int, long o bigint) y lo representa.

* `%e`: Acepta un float y lo representa en notación científica:

  ```java
  System.out.printf("%e", 1.25f);
  // Muestra: 1,250000e+00
  ```

* **`%f`**: Acepta y representa números float.

* `%g`: Acepta números reales float y los representa de distintas formas dependiendo de la precisión.

* `%h`: Acepta cualquier tipo y representa su código hash (resultado del método `hashCode()`).

* **`%n`**: No acepta ningún argumento. Genera una separación de líneas compatible con la plataforma en la que estemos programando.

* `%o`:  Genera la representación **octal** de un valor entero.

* **`%s`** : Acepta cualquier tipo y lo representa como un cadena de caracteres.

* `%t`:  Acepta un valor que represente una fecha u hora. La conversión es más compleja como veremos más adelante.

* `%x`: Representa un valor entero en forma hexadecimal.
