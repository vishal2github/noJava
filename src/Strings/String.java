/*
    | STRING |

        > It is a class.
*/


// Program shows the string class usage.

package Strings;
import java.util.Scanner;

public class String
{
    public static void main(java.lang.String[] args)
    {
        // String with 'new'
        java.lang.String intro = new java.lang.String("Hola, am Gola!");
        System.out.println(intro);

        // Direct String (without new)
        java.lang.String intro2 = "Hello, am Willow!";
        System.out.println(intro2);

        // Printing string data
        java.lang.String name = "Har";
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
        java.lang.String st = sc.nextLine(); // Will print whole content
        System.out.println(st);
    }
}
