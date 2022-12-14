# Programación orientada a objetos

## Conceptos básicos

### Clase

La función de las clases es la de definir las características de un conjunto de objetos (los **objetos** de dicha **clase**).

La clase define la estructura o modelo que se seguirá cuando se construyan objetos de dicho tipo (o clase).

Define las **propiedades** (**estado** o **datos**) que tendrán los objetos de la clase así como los **procedimientos** que se podrán invocar sobre el objeto.

Además de ello una clase puede tener también **datos** y **procedimientos** propios, independientes de la existencia de objetos.

#### Ejemplo:

Por ejemplo, si estamos desarrollando una aplicación para una clínica veterinaria, podríamos definir una clase **Animal** y entre las propiedades de la clase podríamos tener: **nombre**, **fecha de nacimiento**, **patología**, **historial**, etc.

También tendría sentido tener una clase **Propietario** para *modelar* el comportamiento (en lo que a la actividad de la clínica se refiere) y una clase **Historial** para centralizar información y operaciones relativas al historial sanitario del animal.

Cada vez que **creamos** (o **instanciamos**) un objeto hemos de tener en cuenta que pertenece a una clase. Y que las *tripas* del objeto se describen en la dicha clase.

```java
public class Animal {
    public String nombre; // Propiedad de todo animal.
    public long fecha_nacimiento;
    public String patologia;
    // etc.
}
```

### Objeto

Un objeto es una **instancia** de una clase.

Las instancias se crean mediante el uso de la instrucción new, seguida del nombre de la **clase** a la que pertenecerá nuestro objeto:

```java
Animal chuchi = new Animal();
```



### Propiedades

Las propiedades son variables **ligadas a una clase** (variables de clase) o a una **instancia de la clase** (**objeto**) (variables de instancia).

```java
chuchi.nombre = "Chuchiño";
```

### Método

Un método es un **programa** o **algoritmo** que, al igual que las propiedades, está **ligado a una clase** (métodos de clase) o a una **instancia de la clase** (métodos de instancia).

```java
// En la clase animal definimos un método para todos los miembros de la clase:
public class Animal {
    public String nombre;
    
    public void ponerNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String dimeTuNombre() {
        return this.nombre;
    }
}
```

Ahora todos los animales tendrá los **métodos** `ponerNombre` y `dimeTuNombre`.

Para invocar un método hemos de poner primero el **objeto** (o la **clase** si es un método **estático**) seguido de **"."** y el **nombre del método**:

```java
// objeto.método(parámetros);
chuchi.ponerNombre("Chuchiño")
```

### Abstracción de datos

Se trata de un **patrón de diseño** que implica que los datos (**estado interno de un objeto**, o clase) no podrán ser accedidos directamente, si no que se hará mediante una **función** (o **método**).

De esta forma nada **externo al objeto** tiene que conocer cómo está almacenada la información del objeto (estado interno).

Será el objeto el que ofrezca **métodos** para informar de su estado interno o para modificarlo.

``` java
public class Animal {
    private String nombre;
    
    // Método para establecer el valor de nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para obtener el valor de nombre.
    public String getNombre() {
        return this.nombre;
    }
}
```

### Encapsulación

Relacionado con el concepto anterior, la encapsulación evita que el código exterior al objeto tenga que conocer la estructura interna del objeto.

Esta práctica facilita también que se evite el **acoplamiento**.

El hecho de que la clase esté **desacoplada** del resto de clases permite que los cambios internos que hagamos no afecten a ningún otro elemento externo: otras clases y métodos.

Esto facilita la **refactorización**, dado que el creador de una clase podrá cambiar la representación interna de los datos del objeto (mientras no **cambie los métodos públicos** de la clase).

### Herencia / Jerarquía de clases

La herencia sirve para generar una jerarquía de clases teniendo por encima de todas la clase **Object** y por debajo **subclases** y **subclases de dichas clases**.

### Polimorfismo

En programación, polimorfismo hace referencia a la existencia de un único **interface** (un *único* método) para interactuar con distintas **entidades** (clases u objetos).

Los tipos más comunes de polimorfismo son los siguientes:

* Polimorfismo *ad-hoc*: Se define un interfaz común para un grupo arbitrario de **tipos** (clases).
* Polimorfismo paramétrico: 
* Sub-tipado (Herencia): Cuando un nombre puede hacer referencia a instancias de diferentes clases, subclases todas ellas de una **superclase** común.

[Subtyping](https://en.wikipedia.org/wiki/Subtyping) – a form of [polymorphism](https://en.wikipedia.org/wiki/Polymorphism_(computer_science)) – is when calling code can be independent of which class in the  supported hierarchy it is operating on – the parent class or one of its  descendants.  Meanwhile, the same operation name among objects in an  inheritance hierarchy may behave differently.

For example, objects of type Circle and Square are derived from a common class called Shape.  The Draw function for each type of Shape  implements what is necessary to draw itself while calling code can  remain indifferent to the particular type of Shape being drawn.

This is another type of abstraction that simplifies code external to the class hierarchy and enables strong [separation of concerns](https://en.wikipedia.org/wiki/Separation_of_concerns).

## Anatomía de una Clase

### Constructor

### Propiedades y Campos

#### Propiedades de clase

#### Propiedades de instancia

### Métodos

`static`

#### Métodos de clase

#### Métodos de instancia

### Destructor

## Objeto

## Visibilidad

* `public`
* `protected`
* `private`

## Herencia