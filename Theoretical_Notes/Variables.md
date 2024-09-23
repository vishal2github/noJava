# VARIABLES

+ It is a named space reserved by program in memory to keep data.
+ Runtime environment will allocate space in memory to the program on demand of program.

```
    Command to reserve this space in memory should be as follows:
        <variable_datatype> <variable_name>;

    For example: int a; Here, 'int' is datatype and 'a' is variable's name.
```

<br>

### Datatypes

+ Variable has its datatype that provides size and type of variable.

+ Datatypes are divided into following two categories
  + Primitive datatypes
  + Non primitive datatypes

<br>

### Types of variables

+ Instance variables
+ Class variables
+ Local variables

<br>

### Instance variable

+ Also known as non-static variables.
+ Those variables that are declared inside the class without using static modifier.
+ These variables are created each time class is instantiated by JVM.
+ These variables are created each time object from the class is created (process known as instantiation).
+ Hence, also known as instance variables.
+ Object's reference is required to access these variables.
+ Instance variable stores the object's data.

<br>

### Class variable

+ Also known as static variables.
+ These variables are declared inside the class by using static modifier.
+ These variables are created when class is loaded in memory by JVM.
+ *Remember: A class is loaded only once in the memory during lifecycle of the project.*
+ Hence, these variables only single copy in the memory.
+ Class name is required to access these variables.
+ Object reference can also be given to access these variables.

<br>

### Local variable

+ These variables are declared inside method or constructor.
+ Arguments are also local variables.
+ These variables can't be accessed outside the method or constructor.

<br>

### Instance variable vs Reference variable

+ Instance variable:
  + Instance variable stores the object's data.
  + The data of an object is kept in instance variable.

+ Reference variable:
  + Reference variable stores the object's reference.
  + The datatype of this variable is either class or an interface.
