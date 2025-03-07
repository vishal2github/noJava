# **OBJECT CLASS**

<br>

### **Object class**

+ It is a **root class** in java classes hierarchy, from wwhich every class in Java implicitly inherits.

+ It has 11 useful methods, a default constructor, and a static block.

+ There are few ways to create an object:

  + By using new

  + By calling newInstance method of Class class

  + By calling clone method of Object class

  + By de-serialization

+ The Object class is fundamental class, providing essential methods that enable objects to interact with each other, be compared, cloned, and more.

+ Few universal methods provided by an Object class are:

  + toString()
  + equals(Object obj)
  + hashCode()
  + getClass()
  + clone()
  + finalize() [deprecated]
  + wait()
  + notify()
  + notifyAll()
  + etc...

+ Every class in java inherits an object class either directly or indirectly.

+ It is supermost class in the classes hierarchy.

+ **Note:** All the methods of object class is available inside an interface without any implementation or inheritance.

+ The compiler checks the existence of called method inside the type of reference variable.
