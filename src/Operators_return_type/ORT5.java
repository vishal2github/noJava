package Operators_return_type;

public class ORT5
{
    public static void main(String[] args)
    {
        int x1 = -129; // Out-ranged (Negative)
        byte y1 = (byte)x1;
        System.out.println(y1);

        int x2 = -128; // In-ranged (Negative)
        byte y2 = (byte)x2;
        System.out.println(y2);

        int x3 = -100; // In-ranged (Negative)
        byte y3 = (byte)x3;
        System.out.println(y3);

        int x4 = -50; // In-ranged (Negative)
        byte y4 = (byte)x4;
        System.out.println(y4);

        int x5 = -1; // In-ranged (Negative)
        byte y5 = (byte)x5;
        System.out.println(y5);

        int x6 = 0; // In-ranged (Zero)
        byte y6 = (byte)x6;
        System.out.println(y6);

        int x7 = 1; // In-ranged (Positive)
        byte y7 = (byte)x7;
        System.out.println(y7);

        int x8 = 50; // In-ranged (Positive)
        byte y8 = (byte)x8;
        System.out.println(y8);

        int x9 = 100; // In-ranged (Positive)
        byte y9 = (byte)x9;
        System.out.println(y9);

        int x10 = 127; // In-ranged (Positive)
        byte y10 = (byte)x10;
        System.out.println(y10);

        int x11 = 128; // Out-ranged (Positive)
        byte y11 = (byte)x11;
        System.out.println(y11);
    }
}
