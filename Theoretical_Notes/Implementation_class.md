# **IMPLEMENTATION CLASS**

<br>

### **Implementation class**

+ The class that provides the abstract method's body implementation is known as implementation class of that interface.

+ I.e., abstract method's body implementation will be defined in another 'child' class, and that another child class will hence be called as implementation class.

<br>

```
  Note: Class BB is implementation of interface AA:

    public interface AA
    {
      void show();
    }

    public class BB implements AAd
    {
      public void show()
      {
          System.out.println("Welcome");
      }
    }
```

<br>

+ A class can be implementation of multiple interfaces.

<br>

```
  Multiple implementation:

    public interface AA
    {
        void show();
    }

    public interface BB
    {
        public void display();
    }

    public class CC implements AA, BB
    {
        // implementation of both methods
    }
```

<br>

```
  EXTEND (INHERIT) AND IMPLEMENT

    • "Extend" is always written before "Implement".

    • Reason is, the class can extend (inherit) only one interface,
      and can implement multiple interfaces.
```
