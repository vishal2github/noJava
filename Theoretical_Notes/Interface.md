# INTERFACE

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