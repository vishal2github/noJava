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

```
  public void show(); // Incorrect way of defining abstract method as its signature
  
  public abstract void show(); // Correct way of defining abstract method as its signature
```

<br>

### Abstract class

+ The class that can't be instantiated.
+ Means, object from abstract class can't be created.
+ 'Abstract' keyword is used to define abstract class.

```
  Abstract class declaration:

    public abstract class Shape
    {
        // code
    }
```

<br>

### Abstract-class, interface and abstract-method relation

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
