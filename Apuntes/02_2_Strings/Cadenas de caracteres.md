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

Otra forma de realizar esto es mediante el uso de cadenas con formato.

Para ello hemos de usar el método `format` de la clase `String`:

%a 	floating point (except BigDecimal) 	Returns Hex output of floating point number.
%b 	Any type 	"true" if non-null, "false" if null
%c 	character 	Unicode character
%d 	integer (incl. byte, short, int, long, bigint) 	Decimal Integer
%e 	floating point 	decimal number in scientific notation
%f 	floating point 	decimal number
%g 	floating point 	decimal number, possibly in scientific notation depending on the precision and value.
%h 	any type 	Hex String of value from hashCode() method.
%n 	none 	Platform-specific line separator.
%o 	integer (incl. byte, short, int, long, bigint) 	Octal number
%s 	any type 	String value
%t 	Date/Time (incl. long, Calendar, Date and TemporalAccessor) 	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x 	integer (incl. byte, short, int, long, bigint) 	

Hex string.
