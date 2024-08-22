import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        // String with 'new'
        String intro = new String("Hola, am Gola!");
        System.out.println(intro);

        // Direct String (without new)
        String intro2 = "Hello, am Willow!";
        System.out.println(intro2);

        // Printing string data
        String name = "Har";
        System.out.print("The name is ");
        System.out.println(name);

        // Printing string using 'printf' and 'format' method
        int a = 5;
        float b = 3.5f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.print("\n");
        System.out.printf("The value of a is %d and value of b is %5.2f", a, b);
        System.out.print("\n");
        System.out.format("The value of a is %d and value of b is %f", a, b);
        System.out.println("\n");

        // User string input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string below:");
        // String st = sc.next(); // Will print until space appears
        String st = sc.nextLine(); // Will print whole content
        System.out.println(st);
    }
}
