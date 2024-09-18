/*
    | OPERATORS |

        > Assignment Operator: >> Assignment Operator '='

        > Arithmetic Operators: >> Unary Operators: >>> Unary-plus Operator '+x'
                                                    >>> Unary-minus Operator '-x'

                                >> Binary Operators: >>> Addition Operator '+'
                                                     >>> Subtraction Operator '-'
                                                     >>> Multiplication Operator '*'
                                                     >>> Division Operator '/'
                                                     >>> Modulus/Mod Operator '%'

       > Increment/Decrement Operators: >> Pre-increment Operator '++x'
                                        >> Pre-decrement Operator '--x'
                                        >> Post-increment Operator 'x++'
                                        >> Post-decrement Operator 'x--'

       > Comparison/Relational Operators: >> Equal-to Operator '=='
                                          >> Not-equal-to Operator '!='
                                          >> Greater-than Operator '>'
                                          >> Greater-than-or-equal-to Operator '>='
                                          >> Less-than Operator '<'
                                          >> Less-than-or-equal-to Operator '<='

       > Logical Operators: >> Logical OR Operator '||'
                            >> Logical AND Operator '&&'
                            >> Logical NOT Operator '!'

       > Conditional Operator '? :'

       > Comma Operator ','
*/


// Program shows the operator's usage.

package Operators;

public class Operator
{
    public static void main(String[] args)
    {
        // Assignment Operator '='
        int asg1 = 5, asg2 = 6;
        float asg3 = 4.67f;
        double asg4 = 34.45;
        System.out.println("Asg1 int value assigns?: " + asg1);
        System.out.println("Asg1 int value assigns?: " + asg2);
        System.out.println("Asg1 int value assigns?: " + asg3);
        System.out.println("Asg1 int value assigns?: " + asg4 + "\n");

        // Arithmetic Operators on the unary value
        int unr = 5;
        System.out.println("Unary Plus: " + unr);
        System.out.println("Unary Minus: " + -unr + "\n");

        // Arithmetic Operators with basic operations on the binary values
        int v1 = 15, v2 = 2;
        System.out.println("The addition is " + (v1 + v2));
        System.out.println("The subtraction is " + (v1 - v2));
        System.out.println("The multiplication is " + (v1 * v2));
        System.out.println("The division is " + (v1 / v2));
        System.out.println("The modulus is " + (v1 % v2) + "\n");

        // Arithmetic Operators with algebraic operations on the binary values
        int c1 = 5, c2 = 10;
        float c3 = 45.7f;
        double c4 = 2.245, c5 = 34.565;
        double r = ((c2 + c3) * c5) / (c1 - c4);
        System.out.println("The algebraic result is " + r + "\n");

        // Increment and Decrement Operators
        int incDec = 7;
        System.out.println("Pre-increment " + (++incDec));
        System.out.println("Pre-decrement " + (--incDec));
        System.out.println("Post-increment " + (incDec++));
        System.out.println("Post-decrement " + (incDec--) + "\n");

        // Comparison Operators
        int comp1 = 10, comp2 = 20;
        System.out.println("Is equal to?: " + (comp1 == comp2));
        System.out.println("Is not equal to?: " + (comp1 != comp2));
        System.out.println("Is less than?: " + (comp1 < comp2));
        System.out.println("Is greater than?: " + (comp1 > comp2));
        System.out.println("Is less than or equal to?: " + (comp1 <= comp2));
        System.out.println("Is greater than or equal to?: " + (comp1 >= comp2) + "\n");

        // Logical Operators
        int n1 = 5, n2 = 7;
        System.out.println("Logical AND condition: " + ((n1 > n2) && (n1 < n2)));
        System.out.println("Logical OR condition: " + ((n1 > n2) || (n1 < n2)));
        System.out.println("Logical NOT condition: " + (!(n1 > n2)) + "\n");

        // Conditional Operator
        int marks = 38;
        System.out.println("The result is: " + (marks >= 38 ? 'P' : 'F'));
        System.out.println("(6 > 4 ? 9 : 7) --> " + (6 > 4 ? 9 : 7));
        System.out.println("(4 == 9 ? 10 : 25) --> " + (4 == 9 ? 10 : 25) + "\n");

        // Comma Operator (',' is used to separate multiple variables with similar datatypes. For concise text)
        int comma1 = 34, comma2 = 46;
        float comma3 = 2.5f, comma4 = 67.67f;
        Double comma5 = 45.555, comma6 = 5.678;
        System.out.println("Comma 1: " + comma1);
        System.out.println("Comma 2: " + comma2);
        System.out.println("Comma 3: " + comma3);
        System.out.println("Comma 4: " + comma4);
        System.out.println("Comma 5: " + comma5);
        System.out.println("Comma 6: " + comma6 + "\n");
    }
}
