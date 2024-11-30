package Operators_return_type;

public class ORT3
{
    public static void main(String[] args)
    {
        byte x = 100;
        long y = 100;

//		int z1 = x + y;

        int z2 = (int)(x + y);
        System.out.println(z2);

        long z3 = x + y;
        System.out.println(z3);

        float z4 = x + y;
        System.out.println(z4);

        double z5 = x + y;
        System.out.println(z5);
    }
}
