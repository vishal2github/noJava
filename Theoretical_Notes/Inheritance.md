# **INHERITANCE**

<br>

### **Inheritance**

+ Acquring properties of an existing class by a new class _(user-defined class)_ is called **inheritance**.

+ Inheritance feature/concept is used in java by using a specific keyword named **extends.**

+ It has two used cases:

  + Creating extension of an existing class.
  
  + Creating hierarchy of the classes.

<br>

```
  INHERITANCE EXAMPLE

    public class AA
    {
      // properties
    }

    public class BB extends AA
    {
      // properties
    }


  REMARKS

    • Here, class 'BB' is a sub-class/child-class/derived-class of class 'AA'.

    • Here, class 'AA' is a super-class/parent-class/base-class of class 'BB'.

    • Private members of parent-class are not inherited by child-class, i.e., the private
      members are non-inheritable.
      
    • If both parent and child classes are in different package, then child class
      will be able to inherit only public and protected members of parent class.
```

<br>

### **Invocation of parent class constructor**

+ Child class constructor always calls the constructor of parent class.

+ Following command of the child class constructor is responsible to call the constructor of parent class.

<br>

  ```
    COMMAND

      super();

      • This command will be inserted implicitly by compiler inside constructor of child class.
        ‣ It will call non-parameterized/default constructor of parent class.

      • The explicit declaration of command will be required when parameterized constructor
        of parent class from child class constructor will be required to call, along with
        passing the parent class constructor's matching value to this method/command.

        super(matching values);

      • WHY METHOD'S NAME "SUPER"?
        ‣  Because it has a relation with the constructor of parent class,
           and parent class is called as "super" class in Java, hence it's name
           is inspired on the basis of this fact.
  ```

<br>

### **Super command**

+ The super command is basically used when there's a need of calling the parents constructor (implicitly or explicitly) via child class from its parent class.

<br>

  #### Implicitly declared case

  + The super command is automatically declared by the compiler inside child class, when the child class calls the non-parameterized constructor of its parent class.

  <br>

  #### Explicitly declared case

  + The super command is needed to be declared manually inside the child class, when the child class calls the parameterized constructor of its parent class.

    + Hence, along with explicitly declaring super() command, it is also provided with matching parameter-values.

<br>

### **Types of inheritance**

+ There are total five types of java supported inheritances:

  + Single inheritance

  + Multiple inheritance

  + Multi-level inheritance

  + Hierarchical inheritance

  + Hybrid inheritance

<br>

### **Single inheritance**

+ Only a child class is inherited from a parent class.

<br>

```
  SINGLE INHERITANCE EXAMPLE

    public class AA
    {
      // commands
    }

    public class BB extends AA
    {
      // commands
    }
```

<br>

### **Multiple inheritance**

+ Inheriting properties from more than one classes.

+ Means, child class has more than one parent class.

+ In Jave, it isn't allowed in classes but allowed in interfaces.

<br>

```
  MULTIPLE INHERITANCE EXAMPLE

    public class AA
    {
      // commands
    }

    public class BB
    {
      // commands
    }

    public class CC extends AA, BB
    {
      // commands
    }
```

<br>

### **Multi-level inheritance**

+ Serial inheriting from parent to child to child and so on.

<br>

```
  MULTI-LEVEL INHERITANCE EXAMPLE

    public class AA
    {
      // commands
    }

    public class BB extends AA
    {
      // commands
    }

    public class CC extends BB
    {
      // commands
    }
```

<br>

### **Hierarchical inheritance**

+ Mutiple child classes inherited from single parent class.

<br>

```
  HIERARCHICAL INHERITANCE EXAMPLE

    public class AA
    {
      // commands
    }

    public class BB extends AA
    {
      // commands
    }

    public class CC extends AA
    {
      // commands
    }

    public class DD extends AA
    {
      // commands
    }
```

<br>

### **Access modifiers**

+ It is used to set visibility or accessibility of members of the classes.

+ Following three keywords are given in Java to use as access modifiers:

  + Public

  + Protected

  + Private

<br>

```
  MODIFIERS EXAMPLE

    public class AA
    {
      public void method1(); // 100% accessibility
      protected void method2();
      void method3(); // default
      private void method4(); // 0% accessibility
    }
```

<br>

```
                              ACCESSIBILITY TABLE

  ACCESS MODIFIERS    VISIBILITY (Inside package)     VISIBILITY (Outside package)

  public              In all classes                  In all classes  
  
  protected           In all classes                  In child class(s) only
  
  none                In all classes                  Not visible
  
  private             Not visible                     Not visible
```
