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

  + **Logical operators:** && (Logical-and), || (Logical-or), ^ (Logical-xor), ! (Logical-not)

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

### **Increment operator (++)**

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

### **Decrement operator (--)**

+ This operator is used to decrease the value of variable by one.

<br>

### **Relational operators**

+ These operators are used to compare two numeric values.

+ After comparison, these operators return boolean value (true or false).

+ These operators are as follows:

  + <, >, <=, >=, ==, !=

<br>

### **Logical operators**

+ These operators are used to combine two conditions.

+ These operators returns boolean value (true or false) after performing operation.

+ These operators are as follows:

  + &&, ||, ^, !

  <br>

  #### **And (&&) operator**

  + It returns true when both conditions are true.

  + It is a short-circuit logical operator.
    
    + When first condition is false, then "&&" operator returns false without executing second condition.

    + Here, primary short-circuit factor is first-condition-false. will eventually led to short-circuit.

  <br>

  #### **Or (||) operator**

  + It returns true when at least one condition is true.

  + It is a short-circuit logical operator.
    
    + When first condition is true, then "||" operator returns true without executing second condition.

    + Here, primary short-circuit factor is first-condition-true, will eventually led to short-circuit.

  <br>

  #### **Xor (^) operator**

  + It returns true when only one condition is true.

  + It isn't a short-circuit operator, rather a general logical operator.
