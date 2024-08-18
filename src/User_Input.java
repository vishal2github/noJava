/*
    :: USER INPUT ::

        > Having user input requires an initial step by importing a Scanner class.
*/

import java.util.Scanner;  // Importing scanner class (without this Scanner won't work)

public class User_Input
{
    public static void main(String[] args)
    {
        int value;
        Scanner customObjName = new Scanner(System.in);  // Here, customObjName is object's name defined by user
        System.out.println("Enter an integer value");
        value = customObjName.nextInt();  // By nextInt() method, variable "value" can have an integer type value
        System.out.println(value);
        customObjName.close();  // To avoid memory leakages, need to close the object
    }
}
