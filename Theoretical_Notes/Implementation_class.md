# **IMPLEMENTATION CLASS**

<br>

### **Implementation class**

+ The class that provides the abstract method's body implementation is known as **implementation class** of that interface.

+ I.e., abstract method's body implementation will be defined in another 'child' class, and that another child class will hence be called as implementation class.

+ The abstract methods should be defined/implemented with "public" access modifiers in implementation class.

<br>

```
  IMPLEMENTATION STRUCTURE

    public interface AA
    {
      void show();
    }

    public class BB implements AA
    {
      public void show()
      {
          System.out.println("Welcome");
      }
    }

  • NOTE: Class BB is implementation of an Interface AA.
```

<br>

+ A class can be implementation of multiple interfaces.

<br>

```
  MULTIPLE IMPLEMENTATION STRUCTURE

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
