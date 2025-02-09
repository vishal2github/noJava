# **CONSTRUCTOR**

<br>

### **Constructor**

+ Every class must have at least one constructor.

+ Constructor is a special type of method.

+ Constructor has same name as the name of class.

+ Constructor has no return type.

+ Constructor invokes/calls, each time object from that class is created.

+ Constructor can't be called explicitly. It's called automatically.

+ Code to create object contains code to call constructor also.

+ Constructor can be used to initialize objects.

<br>

```
  CONSTRUCTOR SYNTAX

    public class AA
    {
      public void AA() // A general method
      {
      }

      public AA() // A general constructor
      {
      }
    }
```

<br>

### **Types of constructors**

+ There are three types of constructor:

  + Default constructor/Non-parameterized constructor

  + Parameterized constructor

  + Copy constructor

<br>

### **Default constructor**

+ If source code of the class has no constructor, then compiler inserts a non-parameterized constructor inside class file.

+ This constructor is called default constructor.

+ This constructor will assign default values to the instance variables.

+ Default values such as:
  + 0
  + 0.0
  + false
  + null
  + \u0000
  + etc...

<br>

### **Constructor overloaoding**

+ Defining more than one constructor inside a single-class is called **constructor overloading**.

+ Remember, parameter list of constructors must be different.

+ The overloading depends upon the quantity and the datatype of parameters.

<br>

```
  OVERLOADED CONSTRUCTOR SYNTAX

    public class AA
    {
      public AA()
      {
  	    //command
      }

      public AA(int x)
      {
  	  //command
      }
    
      public AA(String y)
      {
  	  //command
      }
    }
```
