# ARRAY

<br>

### **Array**

+ Program can create array in memory to keep similar type of values.
+ Values could be primitive and non-primitive as well.
+ To keep similary type of multiple data, arrays and linked list is used.
+ Memory allocation of an array will be static and in contiguous manner.

+ Memory allocation can be done in two types
  + Static memory allocation
  + Dynamic memory allocation

```
  ARRAY DECLARATION SYNTAX:

    datatype[] array_name = new datatype[size];

  EXAMPLE:

    int[] num = new int[5];
    Point[] p = new Point[5]; // Here, Point is a supposed class (non-primitive datatype)

  PROCESSES:

    Process 1: Memory allocation to the array
    Process 2: Reference generation of the array
    Process 3: Array initialization
    Process 4: Reference return of the array
```

```
  OTHER ARRAY FORMATS:

    Format 1: int[] num = new int[] {1, 2, 3, 4, 5};
    Format 2: int[] num = {1, 2, 3, 4, 5};
```

```
  DEFAULT ARRAY OBJECTS DECLARATION AND THEIR DEFALUT OUTPUT VALUES:

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
