// Program shows the bitwise operator's (left and right shifters) usage on integer values.

package Operators;

public class BitwiseOperators3
{
    public static void main(String[] args)
    {
        // BITWISE LEFT AND RIGHT SHIFT OPERATORS

        // Code 1: Left-shift operator
        int x1 = 10;
        int y1 = x1 << 2;
        System.out.println(y1);

		/*
		   Explanation of above code 1:

		         x1 = 10 = 001010 (in binary)
		  (<< 2)  _________________________
		         y1 = 40 = 101000 (in binary)

		   Since, z1 is using bitwise "<<" operation on binary values
		   of x1 and y1, hence, the binary values of
		   x1 and y1 will be left-shifted by 2-positions and make
		   "101000", and z1 will be assigned 40 in decimal
		   number system.

		   Hence, value output will be 40.
		*/


        // Code 2: Right-shift operator
        int x2 = 10;
        int y2 = x2 >> 2;
        System.out.println(y2);

		/*
		   Explanation of above code 2:

		         x2 = 10 = 001010 (in binary)
		  (<< 2)  _________________________
		         y2 =  2 = 001000 (in binary)

		   Since, z2 is using bitwise "<<" operation on binary values
		   of x2 and y2, hence, the binary values of
		   x2 and y2 will be right-shifted by 2-positions and make
		   "001000", and z2 will be assigned 2 in decimal
		   number system.

		   Hence, value output will be 2.
		*/
    }
}
