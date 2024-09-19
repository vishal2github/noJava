/*
    | WHILE LOOP |
*/


// Program showing simple while loop usage.

package While_Loop;
import java.util.Scanner;

public class WhileLoop
{
    public static void main(String[] args)
    {
        System.out.print("Enter your choice (1 - 3): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Red");
                break;

            case 2:
                System.out.println("Green");
                break;

            case 3:
                System.out.println("Blue");
                break;

            default:
                System.out.println("Wrong choice entered!");
                break;
        }

        sc.close();
    }
}
