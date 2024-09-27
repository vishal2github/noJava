# IMPLEMENTATION CLASS

+ The class that provides the abstract method's body implementation is known as implementation class of that interface.
+ I.e., abstract method's body implementation will be defined in another 'child' class, and that another child class will hence be called as implementation class.

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

+ A class can be implementation of multiple interfaces.

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
