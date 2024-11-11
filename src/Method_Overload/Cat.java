package Method_Overload;

import java.util.Scanner;

public class Cat
{
    int num;

    public void meow()
    {
        System.out.println("meow..");
    }

    public void meow(int num)
    {
        this.num = num;

        for(int m = 0; m < num; m++)
        {
            System.out.println("MEOW");
        }
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sound repetition number: ");
        num = sc.nextInt();

        Cat kitty = new Cat();
        kitty.meow();
        System.out.println("--------------");
        kitty.meow(5);
    }
}

// If a method is non-static, then the other overloaded methods for same will definitely be non-static.
