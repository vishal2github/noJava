package Static_and_NonStatic_Method_Invokings;

public class Pattern
{
    public static void x()
    {
        System.out.println("X");
    }

    public static void circle()
    {
        System.out.println("O");
    }

    public static void cross()
    {
        System.out.println("+");
    }

    public void star()
    {
        System.out.println("*");
    }

    public static void main(String[] args)
    {
        // Static way of calling static methods
        Pattern.circle();
        Pattern.cross();
        Pattern.x();

        // Non-static way of calling a static method (will work, but not recommended)
        Pattern gola = new Pattern();
        gola.circle();

        // Static way of calling (unsuccessful) non-static method
        // Pattern.star(); // This won't work as it's a non-static method

        // Non-static way of calling a non-static method
        Pattern tara = new Pattern();
        tara.star();
    }
}

// Conclusion: Static method can be called with both static (recommended) and non-static way (not recommended).
// Non-static method can only possibly be called via non-static way (via creating an object).
