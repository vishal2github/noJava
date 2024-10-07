package Method_Override;

public class Dog
{
    public static void bark()
    {
        System.out.println("woof..woof");
    }

    public static void main(String[] args) {
        bark();

        // Just for note that followings can work too:
        // Dog.bark();
        // Hound.bark();
        // Hound.sniff();
    }
}
