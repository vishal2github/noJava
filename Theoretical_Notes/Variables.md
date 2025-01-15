# **VARIABLES**

<br>

### **Variable**

+ It is a named space reserved by program in memory to keep data.

+ Runtime environment will allocate space in memory to the program on demand of program.

```
  VARIABLE SYNTAX

    • Command to reserve this space in memory should be as follows:
      <variable_datatype> <variable_name>;

      For example: int a; Here, 'int' is datatype and 'a' is variable's name.
```

<br>

### **Datatypes**

+ Variable has its datatype that provides size and type of variable.

+ Datatypes are divided into following two categories
  + Primitive datatypes
  + Non primitive datatypes

  <br>

  #### **Primitive datatypes**

  + Every programming language provides set of primitive datatypes.

  + These datatypes are system defined (in-built) datatypes.

  + In Java, there are 8 primitive datatypes:
    + byte _(8 bit, Integer value)_
    + short _(16 bit, Integer value)_
    + int _(32 bit, Integer value)_
    + long _(64 bit, Integer value)_
    + float _(32 bit, Decimal value)_
    + double _(64 bit, Decimal value)_
    + boolean _(1 bit, true/false)_
    + char _(1 bit, Character value)_
  
  <br>

  #### **Non-primitive datatypes**

  + These datatypes are also known as user-defined datatype, one can define them.

  + Every class and interface in Java are non-primitive datatype.

  + String is most widely used non-primitive datatype.

<br>

### **Types of variables**

+ Instance variables
+ Reference variables
+ Class variables
+ Constant variables

<br>

### **Variable's types based on scope**

  + Local variables
  + Global variables

<br>

### **Instance variable**

+ Also known as non-static variables.

+ Those variables that are declared inside the class without using static modifier.

+ These variables are created each time class is instantiated by JVM.

+ These variables are created each time object from the class is created (process known as instantiation).

+ Instance variable can have as many as objects will be created in memory.

+ Hence, also known as instance variables.

+ Object's reference is required to access these variables.

+ Instance variable stores the object's data.

<br>

### **Class variable**

+ Also known as static variables.

+ These variables are declared inside the class by using static modifier.

+ These variables are created when class is loaded in memory by JVM via class-loader.
  + *Remember: A class is loaded only once in the memory during lifecycle of the project.*

+ Hence, class variable has only single copy in the memory.

+ Class name is required to access these variables.

+ Object reference can also be given to access these variables.

<br>

### **Local variable**

+ These variables are declared inside method or constructor.

+ Arguments are also local variables.

+ These variables can't be accessed outside the method or constructor.

<br>

### **Instance variable vs Reference variable**

+ **_Instance variable_**
  + Instance variable stores the object's data.

  + The data of an object is kept in instance variable.

+ **_Reference variable_**
  + Reference variable stores the object's reference.

  + The datatype of this variable is either class or an interface.

  + The datatype of reference variable can be any class, or any interface.
    + **Technically, the datatype of reference variable can be any current class, parent class of current class or an interface implemented by that class.**
