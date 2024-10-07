package Method_Override;

public class Hound extends Dog
{
    public static void sniff()
    {
        System.out.println("sniff");
    }

    public static void bark()
    {
        System.out.println("howl");
    }

    public static void main(String[] args)
    {
        sniff();
        bark();  // bark() method has been OVERRIDDEN here!
        Dog.bark();  // As bark method is overridden, for dog, class name 'dog' is mandatory for dog bark to be displayed in Hound class

        // Just for note that followings can work too:
        Hound.sniff();
        Hound.bark();
    }
}
