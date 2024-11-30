// Program shows the bitwise operator's (and/or/xor) usage on integer values.

package Operators;

public class BitwiseOperators2
{
    public static void main(String[] args)
    {
        // BITWISE OPERATORS WITH INTEGER VALUES

        // Code 1: Bitwise "OR" operator with integer values
        int x1 = 10, y1 = 15;
        int z1 = x1 | y1;
        System.out.println(z1);

		/*
		   Explanation of above code 1:

		       x1 = 10 = 1010 (in binary)
		       y1 = 15 = 1111 (in binary)
		  (|)  _________________________
		       z1 = 15 = 1111 (in binary)

		   Since, z1 is using bitwise "OR" operation on binary values
		   of x1 and y1, hence, the binary values of
		   x1 and y1 will get calculated and make "1111", and z1 will be
		   assigned 15 in decimal number system.

		   Hence, value output will be 15.
		*/


        // Code 2: Bitwise "AND" operator with integer values
        int x2 = 10, y2 = 15;
        int z2 = x2 & y2;
        System.out.println(z2);

		/*
		   Explanation of above code 2:

		       x1 = 10 = 1010 (in binary)
		       y1 = 15 = 1111 (in binary)
		  (&)  _________________________
		       z1 = 10 = 1010 (in binary)

		   Since, z2 is using bitwise "AND" operation on binary values
		   of x2 and y2, hence, the binary values of
		   x2 and y2 will get calculated and make "1010", and z2 will be
		   assigned 10 in decimal number system.

		   Hence, value output will be 10.
		*/


        // Code 3: Bitwise "XOR" operator with integer values
        int x3 = 10, y3 = 15;
        int z3 = x3 ^ y3;
        System.out.println(z3);

		/*
		   Explanation of above code 3:

		       x3 = 10 = 1010 (in binary)
		       y3 = 15 = 1111 (in binary)
		  (^)  _________________________
		       z3 = 10 = 0101 (in binary)

		   Since, z3 is using bitwise "XOR" operation on binary values
		   of x3 and y3, hence, the binary values of
		   x3 and y3 will get calculated and make "1010", and z3 will be
		   assigned 5 in decimal number system.

		   Hence, value output will be 5.
		*/
    }
}
