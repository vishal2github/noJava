# **OPERATORS**

<br>

### **Operators**

+ Operators are predefined.

+ Operators are used to perform several operations such as:

  + Arithmetic operations: Addition, subtraction, division, etc.

  + Relational operations: Comparing values

  + Logical operations: Logical needs

  + etc...
  
+ All operators are predefined.

<br>

### **Operators examples**

+ Unary operators

  + **Increment operator:** ++

  + **Decrement operator:** --

  + **Not operator:** !

+ Binary operators

  + **Arithmetic operators:** +, -, *, /, %

  + **Arithmetic assignment operators:** +=, -=, /=, *=, %=

  + **Relational operators:** <, >, <=, >=, ==, !=

  + **Logical operators:** && (Logical-and), || (Logical-or), ^ (Logical-xor)

  + **Bitwise operators:** & (Bitwise-and), | (Bitwise-or), ^ (Bitwise-xor), << (Bitwise left-shift), >> (Bitwise right-shift)

<br>

```
  EXAMPLE
  
    10+20
    Here + is operator 
    10 and 20 are operands for +
```

<br>

+ Bitwise "OR" and "AND" operators can work on boolean and integer operands. Can return boolean and integer result based on provided condition.

+ Logical "OR" and "AND" operators can only work on boolean operands. Can return only boolean result.

+ Logical "AND" operator has more precedence over logical "OR" operator.

+ **Note:** Every operator returns a value after performing operation!

<br>

### **Increment Operator (++)**

+ This operator is used to increase the value of variable by one.

<br>

```
  GENERAL INCREMENT-COMMANDS EXAMPLES

    int x = 10;

    • To increase the value of this variable by one, following three
      commands are possible:
    
      ‣ x = x + 1;

      ‣ x += 1;

      ‣ ++x; or x++;
```

<br>

```
  PREFIX AND POSTFIX INCREMENT OPERATORS EXAMPLE

    int x = 10;
    ++x; // prefix
    x++; // postfix

    • In both cases, value of variable "x" will be incremented by one.
    • Prefix returns the new value of variable.
    • Postfix returns the old value of variable.
```

<br>

### **Decrement Operator (--)**

+ This operator is used to decrease the value of variable by one.
