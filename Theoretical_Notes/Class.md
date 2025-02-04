# **CLASS**

<br>

### **Defining class for object**

+ The following steps are followed in order to define a class:
  + Define instance variable inside class
  + Define constructors
  + Define methods(specially getters and setters)

<br>

```
  CLASS SYNTAX

    public class Point
    {
      // Defining instance variables
      int x;
      int y;

      // Defining paremeterized constructor
      public Point(int a, int b)
      {
    	  this.x = a;
    	  this.y = b;
      }

      // Defining getter and setter methods
      public int getX()
      {
    	  return this.x;
      }

      public void setX(int a)
      {
    	  this.x = a;
      }

      public int getY()
      {
    	  return this.y;
      }

      public void setY(int a)
      {
    	  this.y = a;
      }
    }
  

  NOTE

    • Although "this" wasn't mandatory to be added manually in constructor,
      although added later by complier.

    • Because, the name of instance variables and method's parameters aren't same,
      hence, "x = a" and "y = b" was allowed.

    • But for "a" and "b" as names of instance variables,
      "this" was mandatory to mention manually.

    • For similar names of instance and arguments "this" is mandatory,
      to avoid naming-ambiguity respectively.
```

<br>

### **Class in relation with variables and method**

+ Case 1: Class.static_variable
  + X.y
  + Suppose, 'X' is class, then after-dot entity 'y' will be a static (aka, reference) variable.

+ Case 2: Class.static_method()
  + X.y()
  + Suppose, if 'X' is a class, then after-dot entity 'y()' will be a static method.

+ Conclusion from Case 1 and 2
  + Class will have one of the two entities after the 'dot' symbol, either static variable or static method.

+ Case 3: reference_variable.nonStatic_Variable
  + x.y
  + Suppose, if 'x' is a reference (aka, static) variable, then after-dot entity 'y' will be a non-static variable.

+ Case 4: Class.reference_variable.nonStatic_variable
  + X.y.z
  + Suppose, if 'X' is a class, then 'y' will be a reference (aka static) variable and 'z' will be a non-static varible.

+ Case 5: Class obj =  -.-.reference_variable 
  + AA c = x.y.z;
  + If 'c' is an object variable of class 'AA', then 'x' will be ?, 'y' will be ?, and 'z' will be a reference variable.
  + 'z' will be a reference variable as it is the value that is to be assigned to 'c' object of class AA.

<br>

### **Keywords used with class**

+ The four keywords used with classes are
  + Abstract
  + Final
  + Public
  + Default

<br>

```
  NOTE

    • Abstract method is method without body.

    • Public keyword is an access modifier.

    • Classes c
```

<br>

### **Class's object creation**

+ Ways to create a class object:

  + By using 'new' keyword.

  + By calling 'newInstance()' method of 'class' class.

  + By calling 'clone()' method of object class.

  + By deserialization

<br>

### **Nested class**

+ Also known as "inner class".

+ The class defined inside a parent class is called "member or member class" of parent class.

+ **Purpose:** To group classes that belong together, which makes code more readable and maintainable.

<br>

```
  NESTED/INNER CLASS SYNTAX

    public class AA
    {
      public class BB{} // Non-static nested class of class AA
      public static class CC{} // Static nested class of class AA
      
      public void show()
      {
        class DD // Local nested class of class AA (can't be static)
      }
    }
```

<br>

### **Anonymous nested class**

+ It's a nested class without name.

+ The concept of an anonymous nested class can be used when 
