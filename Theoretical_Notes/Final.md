# FINAL

### Final variable

+ Generally, constant variables are made final.

<br>

### Final variable in class

+ Inline-initialization of final variable is mandatory in a class.

+ The initialization code for final variable will be written in:
  + Inside a constructor.
  + Where there is final variable itself declared.

+ Conditions to decalre final variable inside contructor or at its declared place (isn't mandatory but recommended):
  + If final variable is static, then intialize value at time of final variable declaration thereself. 
  + If non-static, then write code to initialize the final variable in parameterized constructor.

```
  Uninitialized final variable inside class:
    public class AA
    {
        final int num; // Error: Iniline-initialization is must
    }

  Separately-initialized final variable inside class:
    public class AA
    {
        final int num = 45; // Error: Iniline-initialization is must
    }

  Inlined-initialized final variable inside class:
    public class AA
    {
        final int num = 45; // Correct: Iniline-initialized final variable
    }

  Or, using a constructor for separate initialization:
    public class AA
    {
        final int num2;
        public AA(int n)
        {
            num2 = n; // Correct: As initialized using constructor
        }
    }
```

<br>

### Final variable in interface

```
    A simple variable and method is defined inside an interface:
      public interface AA
      {
          int num = 49;
      }

    Upon execution, the compiler will automatically adds required keywords for variable and method:
      public interface AA
      {
          public static final int num;
      }
```
