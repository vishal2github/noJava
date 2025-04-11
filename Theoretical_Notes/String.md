# **STRING**

<br>

### **String**

+ **String** is a set of characters.

+ **Note:** _String is also a name of class, and the english term string is just a datatype name._

+ **char** type array is required to keep string in memory by java program.

+ Writing code to create String's array isn't required, as it is predefined.

+ As, in default package, String class is already written in following three classes:

  + String class

  + StringBuffer class

  + StringBuilder class

+ String class is defined in **java.lang** package.

<br>

```
  STRING CLASS OBJECTS CREATION SYNTAX

    String str1 = new String("Hi");

    StringBuffer str2 = new StringBuffer("Hi");
    
    StringBuilder str3 = new StringBuilder("Hi");
```

<br>

### **toString() method**

+ A method of an **Object class.**

+ **Remember:** It is a non-static method so it must need reference of the object on execution.

+ Returns combination of following three values:

  + **Class name** + **@** + **Hexadecimal value of object's hashcode**

  + E.g., **MyString@4517d9a3**

<br>

### **String class**

+ An immutable/non-modifiable class.

+ Object of immutable class will be immutable object.

+ Value of immutable object can't be changed/modified.

+ Object of this class is created by JVM for each string literals such as "abc".

+ JVM creates this object in **string constant pool** area in the **heap memory.**

+ Single object is created for same string literals.

<br>

### **String class object**

<br>

```
  STRING CLASS OBJECT EXPLAINATION

    String str = "HELLO";
		
		→ String class object will be created.
		→ Char type array will be created and value HELLO will be stored in that array.
		→ The reference of that array will be returned to the String class object and get stored.
		→ String class object will be returned.
```

<br>

### **String class methods**

+ Has several methods, like:

  + public int length()

  + public char chatAt(int index)

  + public int indexOf(char ch)

  + public int lastIndexOf(char ch)

  + public String substring(int fromindex, int toindex)

  + public String substring(int fromindex)

  + public String toUpperCase()

  + public String toLowerCase()

  + public String replace(char old, char new)

  + public String replace(String old, String new)

  + public String trim()

  + public String[] split(String separator)

  + public static String valueOf(int values)
  
    + _This method is overloaded._

  + public boolean equals(Object obj)
  
    + _This is method of Object class. String class and all wrapper classes have overriden it._

    + _equals() method of Object class checks equality of two objects reference and returns a boolean value.
  
  + public boolean equalsIgnoreCase(String value)

  + public int compareTo(Object obj)

    + _It is method of Comparable interface._

    + _String class and all wrapper classes have implemented this interface and given implementation of this method._
  
  + public int compareToIgnoreCase(String str)
