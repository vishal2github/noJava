# **ABSTRACTION**

<br>

### **Abstraction**

+ It is the hiding of non-essential details of an entity/object from the user.

+ So, hiding code complexity (specially implementation of method) can be abstraction in OOP.

+ It is achieved by defining **abstract methods.**

+ If there's an abstract method, then there will be another class where its body have been declared.

+ Abstraction is acquired via abstract class or an interface.

+ Abstract class's abstraction is **partial**, while interface's abstraction is **fully.**

+ **Requirement:** When implementation of a method is to be different, then abstract method is required. 

<br>

### **Abstract method**

+ Method without body or implementation.

+ Use "abstract" keyword in signature (or prototype) of the method to define a method without body.

+ Code will throw an error, if abstract keyword isn't used for signature or prototype.

+ Implementation of an abstract method will be defined in/by child class.

+ First, abstraction method's signature/prototype is declared, then it's body is defined in any child class.

+ **Need of abstract method:** When implementation of the method is to be different.

+ **Rule:** Abstract method can be defined only in "Abstract Class" or "Interface".

<br>

```
  DEFINING ABSTRACT METHOD AS IT'S SIGNATURE

    public void show(); // Incorrect way of defining
  
    public abstract void show(); // Correct way of defining
```

<br>

### **Abstract class**

+ The class that can't be instantiated.

+ Means, object from abstract class can't be created.

+ **Abstract** keyword is used to define abstract class.

+ Reasons to make a class an abtract class:
  
  + To make abstract method in class, that class must be an abstract class.
  
  + To prevent any instantiation of a class _(anywhere)_, that class must be an abstract class.

+ **Recommendation:** If a parent class created is to be used only for inheritance and not for association, then that class is to be made an abstract class, regardless of normal or abstract methods existing inside it.

  + It is for prevention of instantiation _(creation of object)_ of that parent class which is abstract.

<br>

```
  ABSTRACT CLASS DECLARATION

    public abstract class Shape
    {
        // code
    }
```

<br>

### **Abstract-class, interface and abstract-method relation**

+ Abstract class can have both abstract and non-abstract methods.

+ If method's implementation is common/same for all child classes, then that method should be non-abstract in parent class.

+ If method is same in all child classes but implementation is different, then that method will be abstract.

<br>

```
  Abstract method can be declared in abstract class:

    public abstract class AA
    {
        public abstract void show();
    }

  Or, abstract method can be declared in interface:

    public interface AA
    {
        public abstract void show();
    }
```

<br>

### **Why abstract class?**

+ To defined at least one abstract method inside a class, that class must be an abstract class.

+ When instantiation of class isn't needed/required.

<br>

### **Class to class relation**

+ Classes can be used by other class following ways:
  
  + Association _(via creating an object from that class)_
  
    + _**Association HAS A relationship.**_

  + Inheritance _(via inheritance's method call)_
  
    + _**Inheritance IS A relationship.**_

<br>

### **Association**

+ All classes work together.

+ That is, main class is created, and objects from other classes are created in that class and their methods are called according to the needs, this process is called **association.**

+ Association types:
  
  + **Aggregation**
  
  + **Composition**

+ If a class is not to be used via association but from inheritance, then that class should be made abstract, i.e, if that class is made abstract, then that class can't be "instantiated".

+ If a class is not to be used via inheritance but from association, then make that class final, i.e., if class is made final, then that class can't be "inherited".
