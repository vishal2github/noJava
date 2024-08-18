/*
    :: NAMING RULES ::

        > Following rules must be following in naming of class, variable, method, argument, package, constant, etc.
            >> Name must begin with an alphabet.
            >> It can also begin with '$' and '_'.
            >> Symbols aren't allowed in name except dollar and underscore.
            >> Space isn't allowed.
            >> Keywords can't be allowed.


    :: NAMING CONVENTIONS ::

        > Following naming conventions should be followed:
            >> Name should be meaningful.
            >> Class name should be in TitleCase (Pascal's Rule).
            >> Method, variable and argument name should be in camelCase.
            >> Package name should be in lowercase.
            >> Constant name should be in UPPERCASE.
*/


// Program showing the naming rules applied on variables and class.

public class Naming_Conventions  // Class name in TitleCase: recommended
{
    public static void main(String[] args)  // Method name in all small or in camel case: recommended
    {
//        ** INCORRECT VARIABLE NAMING **
//        int 1number = 3;  // Starting with a number: not allowed
//        int 1 number = 3; // Having a space: not allowed
//        int boolean = 3;  // Having a keyword: not allowed
//        int num%ber = 3;  // Having symbols other than '$' and '_': not allowed

//        ** CORRECT VARIABLE NAMING **
        int number = 5;  // Small-case letter starting: allowed
        int $number = 57;  // Starting with dollar sign: allowed
        int _number = 24;  // Starting with an underscore: allowed
        int Number = 32;  // Large-case letter starting: allowed
        long largeNumber = 643675;  // Variable name in camelCase: recommended
        System.out.println(number);
        System.out.println($number);
        System.out.println(_number);
        System.out.println(Number);
        System.out.println(largeNumber);
    }
}
