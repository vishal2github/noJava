/*
    :: THIS ::

        > It is a keyword.
*/

public class This
{
    private int num = 45; // Instance variable 'num'

    public void show1()
    {
        System.out.println(num); // Here, instance variable num will show 45, as compiler has automatically added 'this'
        System.out.println(this.num); // Also, 'this' can be added manually, showing same value 45
    }

    public void show2()
    {
        int num = 25; // Local variable 'num'
        System.out.println(num); // Here, local variable num will show 25, as compiler won't automatically add 'this'
        System.out.println(this.num); // So, to show instance num value, 'this' keyword will have to be added manually
    }

    public static void main(String[] args)
    {
        This obj = new This();
        obj.show1();
        System.out.println();
        obj.show2();
    }
}
