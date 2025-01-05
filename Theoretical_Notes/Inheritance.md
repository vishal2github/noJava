# **INHERITANCE**

<br>

### **Inheritance**

+ Acquring properties of an existing class by a new class (user-defined class) is called inheritance.

+ It has two used cases
  + Creating extension of an existing class.
  + Creating hierarchy of the classes.

<br>

```
  INHERITANCE EXAMPLE

          public class AA
          {
            //properties
          }

          public class BB extends AA
          {
            //properties
          }


  REMARKS

    • Here, class 'BB' is a sub-class/child-class/derived-class of class 'AA'.
    • Here, class 'AA' is a super-class/parent-class/base-class of class 'BB'.
    • Private members of parent-class are not inherited by child-class, i.e., the private
      members are non-inheritable.
    • If both parent and child classes are in different package, then child class
      will be able to inherit only public and protected members of parent class.
```
