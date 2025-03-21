# **INTERFACE**

<br>

### **Interface**

+ It is a structure like class but different from a class.

+ It is only related to "abstract method" and "final variable".

+ Inside interface one can define:
  
  + Method
  
  + Variable
  
  + Class
  
  + Interface

+ Constructors aren't possible inside interface as:

  + Interface has nothing to do with an object, so object creation isn't possible.
  
  + Interface can't be a blueprint of an object.

+ Under interface, all methods created will be abstract and public by default.

+ Under interface, all variables declared will be **public, final and static** by default, i.e., simple declaration of variable inside interface will automatically be public, static and final all together.

<br>

```
  INTERFACE EXAMPLE

    A simple variable and method is defined inside an interface:

      public interface AA
      {
          int num = 49;
          void show();
      }

    
    Upon execution, the compiler will automatically adds required keywords for variable and method:

      public interface AA
      {
          public static final int num;
          public abstract void show();
      }
```

<br>

+ **Requirement:** Interface will specifically be required in condition where the structure will have all methods as abstract and public, and all variables by default as public, static and final (like constant variable).

+ Inside an interface, variables and methods can be defined.

+ Purpose of interface is to define abstract methods.
  + Implementation (body) of these methods will be provided by class.
  + These classes are known as implementation class.

+ Methods inside interface are by default public and abstract.

+ To give implementation of the method inside interface use either static modifier or default modifier.

+ Static method of an Interface won't be visible inside implementation class.
  + It means implementation class can't override static method of an Interface.

+ Default method of an Interface will be visible inside implementation class.
  + It means implementation class can override default method of an Interface.

<br>

```
  POSSIBLE COMBINATIONS

    Class extends Class
    Interface extends Interface(s)
    Class implements Interface(s)
    Class extends Class implements Interface(s)
```

<br>

### **Functional interface**

+ The interface with one-and-only-one abstract method is known as **functional interface.**

+ Use **@FunctionalInterface** annotation in interface declaration, so that compiler checks whether or not it is functional interface.

+ Few functional interfaces are:

  + ActionListner interface

  <br>

  ```
    METHOD WITHIN

      public void actionPerfomed(ActionEvent evt)
  ```

  <br>

  + Runnable interface

  <br>

  ```
    METHOD WITHIN

      public void run()
  ```

  <br>

  + Comparable interface

  <br>

  ```
    METHOD WITHIN

      public int compareTo(Object obj)
  ```

  <br>

  + Comparator interface

  <br>

  ```
    METHOD WITHIN

      public int compare(Object obj1, Object obj2)
  ```

  <br>

  + Predicate interface (Introduced in Java8)

  + Consumer interface (Introduced in Java8)

  + Function interface (Introduced in Java8)

  + Supplier interface (Introduced in Java8)

  + etc...

<br>

### **Lambda expression**

+ It is implementation of the functional interface introduced in Java 8.

+ It is one of the easiest way to provide implementation of functional interface.

<br>

```
  LAMBDA EXPRESSION SYNTAX

    (arguments name) -> {method body};

    • If body of the method has only one command then {} is optional.
```

<br>

```
  LAMBDA EXPRESSION CODE SYNTAX

    AA obj = (name) -> System.out.println("Hello " + name);
    obj.sayHello("Aakash");
    obj.sayHello("Aarti");

    or

    AA obj = (name) -> {
      String message = "Hello " + name;
      System.out.println(message);
    };
    obj.sayHello("Aakash");
    obj.sayHello("Aarti");
```

<br>

### **Marker interface**

+ The interface with no method is known as **Marker Interface**.
