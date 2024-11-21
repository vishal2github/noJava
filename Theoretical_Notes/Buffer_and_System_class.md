# BUFFER AND SYSTEM CLASS

<br>

### **Buffer created by OS**

+ OS system creates following three buffers (stream) for java programs:
  + **Standard output buffer** (Associated with CMD)
  + **Standard input buffer** (Associated with keyboard)
  + **Standard error buffer** (Associated with CMD)

<br>

### **System class**

+ System class has several static methods and static variables.

+ System class on loading creates several objects, like:
  
  + **PrintStream class object**
    + System class creates this object and associates this object with standard output buffer.
    + System class keeps reference of this object in a static variable "out".
    + Data written into this object will be sent by this object to the standard output buffer.
    + Java program will write data into object of PrintStream class.
  
  <br>

  ```
    PRINT METHODS

      System.out.println("Hello");
      System.out.print("Hello");
  ```

  <br>

  + **InputStream class object**
    + System class creates this object and associates this object with standard input buffer.
    + System class keeps reference of this object in a static variable "in".
    + Input accepted by java program using keyboard is kept into standard input buffer by OS.
    + Since this object of InputStream class is associated with standard input buffer so input kept into standard input buffer can be extracted/read by java program from the object of InputStream class.
    + Java program will read data from an object of InputStream class.
  