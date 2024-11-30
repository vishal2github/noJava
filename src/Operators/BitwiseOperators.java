// Program shows the bitwise operator's usage on boolean values.

package Operators;

public class BitwiseOperators
{
    public static void main(String[] args)
    {
        // Bitwise 'OR' operator with boolean values
        System.out.println("Bitwise 'OR' operator with boolean values");

        boolean x1 = false, y1 = true;
        boolean z1 = x1 | y1;
        System.out.print("false | true : ");
        System.out.println(z1);

        boolean x2 = true, y2 = false;
        boolean z2 = x2 | y2;
        System.out.print("true | false : ");
        System.out.println(z2);

        boolean x3 = false, y3 = false;
        boolean z3 = x3 | y3;
        System.out.print("false | false : ");
        System.out.println(z3);

        boolean x4 = true, y4 = true;
        boolean z4 = x4 | y4;
        System.out.print("true | true : ");
        System.out.println(z4);


        // Bitwise 'AND' operator with boolean values
        System.out.println();
        System.out.println("Bitwise 'AND' operator with boolean values");

        boolean x5 = false, y5 = true;
        boolean z5 = x5 & y5;
        System.out.print("false & true : ");
        System.out.println(z5);

        boolean x6 = true, y6 = false;
        boolean z6 = x6 & y6;
        System.out.print("true & false : ");
        System.out.println(z6);

        boolean x7 = false, y7 = false;
        boolean z7 = x7 & y7;
        System.out.print("false & false : ");
        System.out.println(z7);

        boolean x8 = true, y8 = true;
        boolean z8 = x8 & y8;
        System.out.print("true & true : ");
        System.out.println(z8);


        // Bitwise 'XOR' operator with boolean values
        System.out.println();
        System.out.println("Bitwise 'XOR' operator with boolean values");

        boolean x9 = false, y9 = true;
        boolean z9 = x9 ^ y9;
        System.out.print("false ^ true : ");
        System.out.println(z9);

        boolean x10 = true, y10 = false;
        boolean z10 = x10 ^ y10;
        System.out.print("true ^ false : ");
        System.out.println(z10);

        boolean x11 = false, y11 = false;
        boolean z11 = x11 ^ y11;
        System.out.print("false ^ false : ");
        System.out.println(z11);

        boolean x12 = true, y12 = true;
        boolean z12 = x12 ^ y12;
        System.out.print("true ^ true : ");
        System.out.println(z12);
    }
}
