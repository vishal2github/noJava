/*
    | DATATYPE OPERATIONS |

        > Resulting datatype after arithmetic operation:
          >> byte + short → int
          >> short + int → int
          >> long + float → float
          >> int + float → float
          >> char + int → int
          >> char + short → int
          >> long + double → double
          >> float + double → double
*/


// Program shows the datatype usages.

package Datatype;

public class DatatypeOps
{
    public static void main(String[] args)
    {
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a = y + z;
//        float b = 6.5f + x;
//        System.out.println(b);


        // Increment and Decrement Operators
        int i = 56;
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//        System.out.println(i);

        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i);
    }
}
