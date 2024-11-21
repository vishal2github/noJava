# INTERFACE

<br>

### **Interface**

+ It is a structure like class but different from a class.
+ It is only related to 'abstract method' and 'final variable'.

+ Inside interface one can define:
  + Method
  + Varaible
  + Class
  + Interface

+ Constructors aren't possible inside interface as:
  + Interface has nothing to do with an object, so object creation isn't possible.
  + Interface can't be a blueprint of an object.

+ Under interface, all methods created will be abstract and public by default.
+ Under interface, all variables declared will be public, final and static by default, i.e., simple declaration of variable inside interface will automatically be public, static and final all together.

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

```
  POSSIBLE COMBINATIONS

    Class extends Class
    Interface extends Interface(s)
    Class implements Interface(s)
    Class extends Class implements Interface(s)
```

+ The interface with one abstract method is known as "Functional Interface". Few examples are:
  + Predicate Interface
  + Supplier Interface
  + Consumer Interface
  + Function Interface
  + Compare Interface
  + Comparator Interface
  + Runnable Interface

+ The interface with no method is known as "Marker Interface".
