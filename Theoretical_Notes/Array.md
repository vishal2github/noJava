# ARRAY

+ Program can create array in memory to keep similar type of values.
+ Values could be primitive and non-primitive as well.
+ To keep similary type of multiple data, arrays and linked list is used.
+ Memory allocation of an array will be static and in contiguous manner.

+ Memory allocation can be done in two types
  + Static memory allocation
  + Dynamic memory allocation

```
  Syntax of an array:
    datatype[] array_name = new datatype[size];

  Example:
    int[] num = new int[5];
    Point[] p = new Point[5]; // Here, Point is a supposed class (non-primitive datatype)

  Processes of above examples:
    Process 1: Memory allocation to the array
    Process 2: Reference generation of the array
    Process 3: Array initialization
    Process 4: Reference return of the array

  Other array format:
    Format 1: int[] num = new int[] {1, 2, 3, 4, 5};
    Format 2: int[] num = {1, 2, 3, 4, 5};
```
