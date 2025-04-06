# **EXCEPTION, EXCEPITON HANDELING, AND FINALLY BLOCK**

<br>

### **Exception**

+ An abnormal event/condition is known as **exception**, and can be handled. 

+ During program's execution, some abnormal conditions might be occured.

+ Due to these abnormal condtitions, program might be terminated.

+ Exceptions usually occur when the program encounters a condition it doesn't know how to handle.

+ When an exception occurs, the program typically stops executing, unless the exception is caught and handled properly.

+ By handling exceptions, the program can continue running or provide a useful error message to the user.

+ Handling exceptions has following advantages:

  + Will protect program from being terminated amid exception encounter.

  + Informing user about abnormal condition.

+ Exception handling has three important terms:

  + **Creating exception**

    + Creating object of respective exception class, and storing messege about abnormal condition in object.

  + **Throwing exception**

    + Sending/forwarding exception class object's reference to the program.

  + **Catching exception**

    + Accepting reference of the exception.

<br>

```
  NOTE

    • Exception can be handeled, while error can't be handeled.
```

+ Typical examples of exception:

  + **Zero division error _(Python)_:** Happens when try to divide a number by zero.

  + **File not found error _(Python)_:** Happens when a non-existing file is being opened.

  + **Index out of range exception _(C#, Java)_:** Happends when a non-existing index is being accessed in an array or list.

  + **Null pointer exception _(Java, C#)_:** Happens when a non-initialized object or variable is being referenced.

<br>

### **Exceptions types**

  #### **Checked exceptions**

  + The exception which can't be stopped are known as **Checked exceptions**.

  + **Try and catch** or **Throws** statement is needed to be decalred in this case.

  + These exceptions must be explicitly handeled by the programmer.

  + **Example:** FileNotFoundException 

  <br>

  #### **Un-checked exceptions**

  + The exception which can't be prevented are known as **Unchecked exceptions**.

  + These exceptions occur during runtime, and compiler doesn't require them to be explicitly caught.

  + **Example:** NullPointerException, ArrayIndexOutOfBoundsException

<br>

### **Exception handling concepts**

  #### **Try block**

  + This is where the code that might raise an exception is placed.

  <br>

  #### **Catch/except block**

  + This part allows to "catch" the exception if one is raised in the try block and define what actions to take when the exception occurs.

  <br>

  #### **Finally block**

  + Used to execute code that shouldn't run no matter what, whether an exception is raised or not.

  + Typically used for cleanup operations, like closing files or releasing resources.

  <br>

  #### **Raising exception**

  + One might want to raise an exception explicitly, often when a condition is met that makes it impossible to continue normal execution.

  <br>

  #### **Custom exceptions**

  + To define the own exceptions to handle specific error cases that aren't covered by standard exceptions.

<br>

### **Important points**

+ If overriden method ...

+ Writing throws statement in un-checked exception is unnecessary.

<br>

### **Exception classes**

+ Topmost class of hierarchy is **Throwable** _(in java.lang package)_.

+ It has following two child classes:

  + Exception class

  + Error class

<br>

```
  ERROR SUBCLASS OF THROWABLE CLASS

    • An "Error" is a subclass of "Throwable" that indicates
      serious problems that a reasonable application should
      not try to catch.
    
    • Direct known error subclasses:

      ‣ AssertionError
      
      ‣ LinkageError
      
      ‣ ThreadDeath

      ‣ VirtualMachineError
```

<br>

### **Exception class**

+ This can be caught.

+ It has several child classes, like:

  + IOException class

  + FileNotFoundException class

  + InterruptedException class

  + ClassNotFoundException class

  + RuntimeException class

+ **RuntimeException class**

  + It is an unchecked exception class.

  + Remember, "Error" class is also unchecked exception class.

  + RuntimeException class has several childs, like:

    + ArithmeticException class

    + NullPointerException class

    + ArrayIndexOutOfBoundsException class

    + ClassCastException class

    + etc...

<br>

### **Throw and exception**

<br>

### **What and why?**

+ If a method can face abnormal conditions, to tackle those, "throw" keyword will be used inside method's body.

+ If exception is in "checked" category, then in method's signature/prototype, after parathesis, "throws" statement/keyword is required.

+ This "throws" keyword becomes signature's part that will warn caller about method which can face unexptected conditions, and suggest not to call that without "try and catch".

<br>

### **Throws vs Throw**

+ **Throws** is written within method's signature/prototype to inform the caller that upon invoking certain method could generate the certain exception.

+ **Throw** is used in method's body and not in prototype, used to specifically throw certain error/exception.
