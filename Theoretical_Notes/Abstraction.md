# ABSTRACTION

+ It is the hiding of non-essential details of an entity/object from the user.
+ So, hiding code complexity (specially implementation of method) can be abstraction in OOP.
+ It is achieved by defining 'abstract methods'.
+ If there's an abstract method, then there will be another class where its body have been declared.
+ **Rule:** Abstract method can be defined only in 'abstract class' or 'interface'.
+ When implementation of that method is to be different, then abstract method is required. 

<br>

### Abstract method

+ Method without body or implementation.
+ Use 'abstract' keyword in signature (or prototype) of the method to define a method without body.
+ Code will throw an error, if abtract keyword isn't used for signature or prototype.
+ Implementation of an abstract method will be defined in/by child class.
+ First, abstraction method's signature/prototype is declared, then it's body is defined in any child class.

```
  public void show(); // Incorrect way of defining abstract method as its signature
  
  public abstract void show(); // Correct way of defining abstract method as its signature
```

<br>

### Abstract class

+ The class that can't be instantiated.
+ Means, object from abstract class can't be created.
+ 'Abstract' keyword is used to define abstract class.

+ Reasons to make a class an abtract class:
  + To make abstract method in class, then that class must be an abstract class.
  + To prevent any instantiation of a class (anywhere), then that class must be an abstract class.

```
  Abstract class declaration:

    public abstract class Shape
    {
        // code
    }
```

<br>

### Abstract-class, interface and abstract-method relation

+ Abstract class can have both abstract and non-abstract methods.
+ If method's implementation is common/same for all child classes, then that method should be non-abstract in parent class.
+ If method is smae in all child classes but implementation is different, then that method will be abstract.

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

### Why abstract class?

+ To defined at least one abstract method inside a class, that class must be an abstract class.
+ When instantiation of class isn't needed/required.
