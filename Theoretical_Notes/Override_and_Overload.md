# **"OVER-RIDE VS OVER-LOAD" & "OVER-WRITE VS OVER-RIDE"**

<br>

### **Over-ride vs over-load**

  #### **Method over-riding**

  + Implements "runtime polymorphism".

  + The method call is determined at runtime based on the object type.

  + Occurs between superclass and subclass.

  + Have the same signature (name and method arguments).

  + On error, the effect will be visible at runtime.

  <br>

  #### **Method over-loading**

  + Implements "compile time polymorphism".

  + The method call is determined at compile time.

  + Occurs between the methods in the same class.

  + Have the same name, but the parameters name/order/quantity are different.

  + On error, it can be caught at compile time.

<br>

### **Over-write vs over-ride**

+ **Over-write:** To "overwrite" something is to put something else in its place, destroying the thing overwritten.

+ **Over-ride:** To "override" something is to cause something else to operate instead of it without harming or changing the thing overridden.

<br>

### **Method overriding**

+ To redefine parent class methods into child class is called **method overriding.**

+ Overriding method has two purposes:
  
  + When child class has to change the implementation method of its super/parent class.
    
  + In case where there's no implementation method of super/parent class.

+ **Final method** of a parent/super class can be inherited, but can't be overridden by child class.

  + _Although, making methods final depends upon requirements._

+ Static, final, and private methods can't be overridden.

<br>

  #### **Method overriding rules**

  + Parameter list of both methods _(overriding and overridden)_ must be same.

  + Return-type of both methods must also be same.

  + Method of child class can't be less-accessible than the parent class method.
