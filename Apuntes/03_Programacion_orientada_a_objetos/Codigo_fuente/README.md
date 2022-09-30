# Instrucciones de compilación y ejecución
## Compilación
Para compilar el código debemos situarnos en el directorio `codigo_fuente` y ejecutar el siguiente comando:

```bash
javac -encoding utf8 -sourcepath . Main.java
```

### Explicación
La opción `-enconding utf8` indica a compilador (`javac`) que el archivo de código fuente (`Main.java`) está codificado en **Unicode**.

La opción `-sourcepath` indica al compilador que el código fuente de nuestro *proyecto* está en el directorio alcual (`.` = `codigo_fuente`).

De esta forma el compilador encontrará todos las clases que  en `Main.java` como `org.cotarelo.gestion.AlumnoFP`, `org.cotarelo.gestion.Ciclo`, etc.

La ruta `org.cotarelo.gestion` es el nombre del **paquete** en el que se agrupan las clases que usamos en nuestro proyecto.

## Ejecución
Para ejecutar nuestro programa hemos de escribir (dentro del directorio `codigo_fuente`):
```java
java Main
```
