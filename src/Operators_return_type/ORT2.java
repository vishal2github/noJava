package Operators_return_type;

public class ORT2
{
    public static void main(String[] args)
    {
        byte x = 100, y = 100;

//		byte z1 = x + y;

        byte z2 = (byte)(x + y);
        System.out.println(z2);

        int z3 = x + y;
        System.out.println(z3);

        long z4 = x + y;
        System.out.println(z4);

        float z5 = x + y;
        System.out.println(z5);

        double z6 = x + y;
        System.out.println(z6);
    }
}
