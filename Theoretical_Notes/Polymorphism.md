# **POLYMORPHISM**

<br>

### **Polymorphism**

+ It means many forms or one can say one name and many forms.

+ It reduces code complexity.

+ There are two types of polymorphism:

  + **Static polymorphism** _(Compile-time polymorphism)_

  + **Dynamic polymorphism** _(Run-time polymorphism)_

<br>

### **Static polymorphism**

+ Existing in different physical forms simultaneously.

+ It is achieved by following two ways:

  + Operator overloading
  
  + Method overloading

+ Static polymorphism is also known as **compile-time polymorphism.**

<br>

### **Dynamic polymorphism**

+ Changing its forms depending upon circumstances.

+ It is achieved by only one way:

  + Method overriding

+ Dynamic polymorphism is also known as **run-time polymorphism.**

<br>

### **Method overloading**

+ Defining more than one same name methods inside a class is called **method overloading.**

+ Remember parameter list of same name methods must be different.

+ Conditions for making method overloaded:

  + Quantity of parameters
  
  + Datatype of paramters
  
  + Sequence of parameters

+ **Note:** Return type and modifiers of overloaded methods don't play any role in method overloading.

<br>

```
  METHOD OVERLOADING EXAMPLE

    void add(int x, float y);
    int add(int a, float b);
```
