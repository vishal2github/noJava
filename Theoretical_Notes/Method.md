# **METHOD**

<br>

### **Method**

+ It is set of commands/instructions.

+ These commands are executed in a sequence to perform a specific task.

<br>

#### **How to define/create method?**

+ Method is defined/created inside class by defining:
  + Prototype of the method.
  
  + Body of the method.

<br>

#### **Method prototype**

+ Prototype of method is specification of that method.

+ One can get information about the method from its prototype.

+ Method prototype contains the following specifications:
  + Modifiers _(Optional)_
    + Public
    + Private
    + Static
    + Final
    + Abstract
    + Synchronized

  + Method name _(Mandatory)_
  + Return type _(Mandatory)_
  + Argument list (name with datatype) _(Optional)_

<br>

```
  PROTOTYPE EXAMPLE

    public static void main(String[] args)

    • Prototype of "main" method consists:
      ‣ public and static: Modifiers
      ‣ void: Return type of method
      ‣ main: Name of method
      ‣ args: Argument name
      ‣ String[]: Argument datatype
```

<br>

+ Prototype of methods can have following four parts:
  + Name followed by parantheses **(Mandatory)**
  + Return type just before the name **(Mandatory)**
  + Modifiers just before return type **(Optional)**
  + Argument list: Inside parantheses **(Optional)**

<br>

### **Body of the method**

+ It is also called implementation of method.

+ It contains executable commands.

+ Few commands are as follows:
  + Command to create variable
  + Command to assign value to the variable
  + Command to perform arithmetic operation
  + Command to perform relational operation
  + Command to apply condition
  + Command to execute loop
  + Command to return value
  + Command to call method
  + Command to create object
  + Command to create array
  + etc...

<br>

### **Calling method**

+ As known, body of method has executable commands.

+ These commands are executed in a sequence to perform a specific task.

+ These commands will be executed/run when method will be called.

<br>

```
  COMMAND CALL EXAMPLE

    System.out.println("Hello");

    • Command to call println() method.
```

<br>

```
  COMMAND CALL EXAMPLE

    public class AA
    {
        static void sayHello()
        {
            System.out.println("Hello everyone");
        }

        static void sayBye()
        {
            System.out.println("Bye everyone");
        }

        public static void main(String[] args)
        {
            sayHello(); // sayHello() call command
            sayBye(); // sayBye() call command
        }
    }
```
