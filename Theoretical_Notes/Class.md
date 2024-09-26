# CLASS

### Defining class for object

+ The following steps are followed in order to define a class:
  + Define instance variable inside class
  + Define constructors
  + Define methods(specially getters and setters)

```
  Example of general class:

    public class Point
    {
      // Defining instance variable
      int x;
      int y;

      // Defining constructor
      public Point(int a,int b)
      {
    	this.x=a;
    	this.y=b;
      }

      // Defining methods
      public int getX()
      {
    	return this.x;
      }

      public void setX(int a)
      {
    	this.x=a;
      }

      public int getY()
      {
    	return this.y;
      }

      public void setY(int a)
      {
    	this.y=a;
      }
    }
```

<br>

### Class in relation with variables and method

+ Case 1: Class.static_variable
  + X.y
  + Suppose, X is class, then after-dot entity 'y' will be a static variable.

+ Case 2: Class.static_method()
  + X.y()
  + Suppose, if X is a class, then after-dot entity 'y()' will be a static method.

+ Conclusion from Case 1 and 2
  + Class will have one of the two entities after the 'dot' symbol, either static variable or static method.

+ Case 3: reference_variable.nonStatic_Variable
  + x.y
  + Suppose, if x is a reference variable, then after-dot entity 'y' will be a non-static variable.

<br>

### Keywords used with class

+ The four keywords used with classes are
  + Abstract
  + Final
  + Public
  + Default

```
  Note:
    > Abstract method is method without body.
    > Public keyword is an access modifier.
    > Classes c
```

<br>

### Class's object creation

+ Ways to create a class object:
  + By using 'new' keyword.
  + By calling 'newInstance()' method of 'class' class.
  + By calling 'clone()' method of object class.
  + By deserialization
