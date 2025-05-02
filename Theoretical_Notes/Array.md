# **ARRAY**

<br>

### **Array**

+ Array is most fundamental data structure.

+ Array helps storing multiple values of same type in a single variable.

+ Array is useful for storing and managing collections of data.

+ Program can create array in memory to keep similar type of values.

+ Values could be primitive and non-primitive as well.

+ In primitive array, elements are stored in contiguous memory location.

+ In non-primitive array, references are stored at contiguous locations, but actual objects may be at different locations in memory.

+ To keep similary type of multiple data, arrays and linked list is used.

+ Memory allocation of an array will be static and in contiguous manner.

+ Memory allocation can be done in two types:

  + Static memory allocation

  + Dynamic memory allocation

+ **Static memory allocation:** Memory will be allocated only once during the program lifecycle.

+ **Dynamic memory allocation:** Memory will be allocated on demand within the program lifecycle.

<br>

```
  ARRAY DECLARATION SYNTAX

    datatype[] array_name = new datatype[size];


  EXAMPLE

    int[] num = new int[5];
    Point[] p = new Point[5]; // Here, Point is a supposed class (non-primitive datatype)


  PROCESSES

    • Process 1: Memory allocation to the array
    • Process 2: Reference generation of the array
    • Process 3: Array initialization
    • Process 4: Reference return of the array
```

<br>

```
  ARRAY-DECLARATION FORMATS

    • Format 1: type[] variable_name;
    • Format 2: type variable_name[];

  
  ARRAY-DECLARATION WITH INITIALIZATION FORMATS

    • Format 1.1: int[] num = new int[] {1, 2, 3, 4, 5};
    • Format 1.2: int[] num = {1, 2, 3, 4, 5};
    
    • Format 2.1: int[] num = new int[] {1, 2, 3, 4, 5};
    • Format 2.2: int num[] = {1, 2, 3, 4, 5};
```

<br>

```
  DEFAULT ARRAY OBJECTS DECLARATION AND THEIR DEFALUT OUTPUT VALUES

    public class App
    {
    	public static void main(String[] args)
    	{
    		int[] o1 = new int[5];  // sout o1 = 0
    		float[] o2 = new float[5];  // sout o2 = 0.0
    		boolean[] o3 = new boolean[5];  // sout o3 = false
    		String[] o4 = new String[5];  // sout o4 = null
    		char[] o5 = new char[5];  // sout o5 = ____
    		
    		byte[] o6 = new byte[5]; // sout o6 = 0
    		short[] o7 = new short[5];  // sout o7 = 0
    		long[] o8 = new long[5];  // sout o8 = 0
    		double[] o9 = new double[5];  // sout o9 = 0.0
    	}
    }
```

<br>

### **Features of array**

+ Contiguous memory allocation (for primitives)

+ Zero-based indexing

+ Fixed length

+ Stores primitives and objects

<br>

### **Properties of array**

+ Arrays are **dynamically allocated** in Java.

+ Arrays are object in Java, it's length can be find using object property **length**.

+ Variables in array are ordered, and each has index beginning with **zero**.

+ Array can also be used as static field, a local variable, or a method parameter.

<br>

### **Types of array**

+ Single-dimensional array

+ Multi-dimensional array
