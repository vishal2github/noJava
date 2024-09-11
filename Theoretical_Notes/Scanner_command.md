# SCANNER COMMAND

### Scanner sc = new Scanner(System.in);

+ 'Scanner' is imported using 'import java.util.Scanner' via eclipse.

+ Then 'sc' object is created and input stream's object reference is passed in its constructor.
  + There's a class named input stream.
  + Then object 'sc' is created on behalf of that input stream class.
  + Then that object's reference is created.

+ System is a class.
+ 'in' is a declared static variable inside 'System' class.

```
  General Question
    What is passed in constructor of Scanner?

    Reference of an input-stream class's object, i.e, the user input is kept in input stream's object by Java.
    Then, Scanner retrieves that user's input value.
```

<br>

### Technical Process

+ User inputs from standard input device (keyboard).
+ For this, a buffer is created in memory via OS known as standard input buffer.
+ To take data from standard input buffer, the Java has created an input stream class.
+ After that, three buffers are created in the memory via OS
  + Standard input buffer
  + Standard error buffer
  + Standard output buffer

```
  Buffer: The location reserved in memory by OS or an object is known as Buffer.
```
