# JavaFundamentals-GMD
Java Fundamentals (10h)

Lesson 3 (4h):

- Principios S.O.L.I.D

- Algorítmos y ejercicios

### Principios S.O.L.I.D

#### S. Single Responsability Principle - "Principo de Responsabilidad única"

- "A class should have only one reason to change." | Una clase  debería tener una única razón para cambiar.

- En este caso deberiamos asociar una responsabilidad a un razón para realizar un cambio en una clase. Si tu puedes pensar en mas de un motivo para cambiar una clase, entonces esta clase tiene mas de una responsabilidad.

```java
    private void test() {
       System.out.print("Hello Java !");
    }
```

#### O. Open-Closed Principle - "Principo Abierto-Cerrado"

- "software entities (classes, modules, functions, etc) should be open for extension, but closed for modification" Las entidad de software como las clases, módulos, funciones , métodos deberían ser abiertas para extensión, pero cerradas para modificación.


```java
    private void test() {
       System.out.print("Hello Java !");
    }
```

#### L. Liskov Substition Principle - "Principo de substitución de Liskov"

- "Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program." 

```java
    private void test() {
       System.out.print("Hello Java !");
    }
```

#### I. Interface Segregation Principle - "Principio de Segregación de Interfaces"

- "Many client-specific interfaces are better
than one general purpose interface." | Muchas interfaces específicas de cliente son mejores que una interfaz de propósito general.

```java
    private void test() {
       System.out.print("Hello Java !");
    }
```

#### D. Dependency Inversion Principle - "Principo de Inversión de dependencias"

- "High-level modules should not depend on low-level modules. Both should depend on abstractions." | Módulos de alto nivel no deberian depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

- "Abstractions should not depend on details. Details should depend on abstractions." | Las abstracciones no deben depender de los detalles. Los detalles deberian depender de abstracciones.

- "Depend on Abstractions. Do not depend on concretions." | Depender de abstracciones. No depender de concreciones.


```java
    function test() {
      console.log("notice the blank line before this function?");
    }
```


### Referencias :

- SOLID [https://en.wikipedia.org/wiki/SOLID_(object-oriented_design)](https://en.wikipedia.org/wiki/SOLID_(object-oriented_design))

- Realm [https://realm.io/news/donn-felker-solid-part-1/](https://realm.io/news/donn-felker-solid-part-1/)



